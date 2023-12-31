import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NewsletterComponent } from './newsletter/newsletter.component';
import { RepositoryComponent } from './repository/repository.component';
import { LoanApprovalComponent } from './loan-approval/loan-approval.component';

@NgModule({
  declarations: [
    AppComponent,
    NewsletterComponent,
    RepositoryComponent,
    LoanApprovalComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
