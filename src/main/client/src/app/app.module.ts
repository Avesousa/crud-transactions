import { interceptorProvider } from './middlewares/auth.middleware';
import { CUSTOM_ELEMENTS_SCHEMA, NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { CommonModule } from '@angular/common';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { HeaderComponent } from './components/header/header.component';
import { TransactionsComponent } from './components/transactions/transactions.component';
import { TransactionService } from './services/transaction.service';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { FilterPipe } from './helpers/filter.pipe';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import { RangeComponent } from './components/transactions/range/range.component';
import { FilterComponent } from './components/transactions/filter/filter.component';
import { FilterDatePipe } from './helpers/filter-date.pipe';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    TransactionsComponent,
    FilterPipe,
    LoginComponent,
    RegisterComponent,
    RangeComponent,
    FilterComponent,
    FilterDatePipe
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    CommonModule,
    AppRoutingModule,
    FormsModule,
    NgbModule
  ],
  schemas: [CUSTOM_ELEMENTS_SCHEMA],
  providers: [interceptorProvider,HttpClientModule,TransactionService],
  bootstrap: [AppComponent]
})
export class AppModule { }
