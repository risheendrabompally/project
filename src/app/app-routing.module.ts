import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CustomersListComponent } from './customers-list/customers-list.component';
import { CreateCustomerComponent } from './create-customer/create-customer.component';
import { SearchCustomersComponent } from './search-customers/search-customers.component';
import { RegisterCustomersComponent } from './register-customers/register-customers.component';
import { LoginCustomersComponent } from './login-customers/login-customers.component';
//import { DashboardComponent } from './dashboard/dashboard.component';
import { HomeComponent } from './home/home.component';
import { OwnerLoginComponent } from './owner-login/owner-login.component';
import { OwnerRegisterComponent } from './owner-register/owner-register.component';

const routes: Routes = [
    { path: '', redirectTo: 'home', pathMatch: 'full' },
    { path: 'customer', component: CustomersListComponent },
    { path: 'add', component: CreateCustomerComponent },
    { path: 'findbyage', component: SearchCustomersComponent },
    { path: 'register', component: RegisterCustomersComponent },
    { path: 'login', component: LoginCustomersComponent },
   // { path: 'dashboard', component: DashboardComponent },
   { path: 'home', component: HomeComponent },
   { path: 'ownerLogin', component: OwnerLoginComponent },
   { path: 'ownerRegister', component: OwnerRegisterComponent }
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})

export class AppRoutingModule { }
