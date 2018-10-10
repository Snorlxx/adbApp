import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';

import { RouterModule, Routes } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { MyProfileComponent } from './my-profile/my-profile.component';
import { ActivePlansComponent } from './active-plans/active-plans.component';
import { MonthlyBillingComponent } from './monthly-billing/monthly-billing.component';
import { PaymentDetailsComponent } from './payment-details/payment-details.component';

const routeMap:Routes=[
  {path:'',component:MyProfileComponent},
  {path:'ap', component:ActivePlansComponent},
  {path:'mb',component:MonthlyBillingComponent},
  {path:'pd',component:PaymentDetailsComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    MyProfileComponent,
    ActivePlansComponent,
    MonthlyBillingComponent,
    PaymentDetailsComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routeMap),
    FormsModule,
    HttpModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
