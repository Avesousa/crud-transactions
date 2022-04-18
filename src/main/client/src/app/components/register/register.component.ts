import { AuthService } from './../../services/auth.service';
import { TokenService } from './../../services/token.service';
import { UserRegister } from './../../models/userRegister';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserLogin } from 'src/app/models/userLogin';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent implements OnInit {

  public userRegister: UserRegister;
  public isFailRegister: Boolean;
  public errorMessage: string;

  constructor(private tokenService: TokenService, private authService: AuthService, private router: Router) {
    this.userRegister = new UserRegister("","","");
    this.isFailRegister = false;
    this.errorMessage = "";
  }

  ngOnInit(): void {
    if(this.tokenService.getToken()){
      this.router.navigate(['/']);
    }
  }

  onRegister(): void {
    this.authService.register(this.userRegister).subscribe( (_userRegister) => {
      this.authService.login(new UserLogin(this.userRegister.username, this.userRegister.password)).subscribe((jwt) => {
        this.tokenService.setToken(jwt.token);
        this.tokenService.setUserName(jwt.username);
        this.tokenService.setAuthorities(jwt.authorities);
        this.router.navigate(['/']);
      },
      err => {
        this.errorMessage = "Parece que hay un error en los datos";
        this.isFailRegister = true;
        console.log("Error", err.error.message);
      })
    }, err => {
      this.errorMessage = err.error.message;
      this.isFailRegister = true;
      console.log("Error", err.error.message);
    });

  }

  goToLogin(){
    this.router.navigate(["/login"]);
  }
}
