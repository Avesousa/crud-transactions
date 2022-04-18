import { Observable } from 'rxjs';
import { TokenService } from './../../services/token.service';
import { Component, OnChanges, OnInit, SimpleChanges } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'Header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})
export class HeaderComponent implements OnChanges, OnInit{

  public isButtonLogoutShow: Boolean = false;

  constructor(public tokenService:TokenService, private router: Router) { }

  ngOnInit(): void {
    this.isButtonLogoutShow = this.tokenService.getToken() != null;
  }

  ngOnChanges(changes: SimpleChanges): void {
    console.log("Changes", changes);
    this.isButtonLogoutShow = this.tokenService.getToken() != null;
  }

  onLogout() {
    this.tokenService.logOut();
    this.router.navigate(['/login']);
  }

}
