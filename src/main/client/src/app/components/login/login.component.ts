import { TokenService } from './../../services/token.service';
import { Component, OnInit } from '@angular/core';
import { UserLogin } from 'src/app/models/userLogin';
import { AuthService } from 'src/app/services/auth.service';
import { Jwt } from 'src/app/models/jwt';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  public userLogin: UserLogin;
  public isLogged: Boolean;
  public isFailLogin: Boolean;
  public errorMessage: string;

  constructor(private tokenService: TokenService, private authService: AuthService, private router: Router) {
    this.userLogin = new UserLogin("","");
    this.isLogged = false;
    this.isFailLogin = false;
    this.errorMessage = "";
  }

  ngOnInit(): void {
    if(this.tokenService.getToken()){
      this.isLogged = true;
    }
  }

  onLogin(): void {
    console.log("Userlogin", this.userLogin);
    this.authService.login(this.userLogin).subscribe( jwt => {
      this.tokenService.setToken(jwt.token);
      this.tokenService.setUserName(jwt.username);
      this.tokenService.setAuthorities(jwt.authorities);
      this.isLogged = true;
      this.router.navigate(['/']);
    },
    err => {
      this.isLogged = false;
      this.errorMessage = "Parece que hay un error en los datos";
      this.isFailLogin = true;
      console.log("Error", err.error.message);
    }
    );

  }

  goToRegister(){
    this.router.navigate(['/register']);
  }

}
