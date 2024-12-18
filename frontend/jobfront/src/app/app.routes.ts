import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { EnquiryComponent } from './enquiry/enquiry.component';
import { ViewEnquiryComponent } from './view-enquiry/view-enquiry.component';
import { ViewFeedbackComponent } from './view-feedback/view-feedback.component';
import { ViewRegisterComponent } from './view-register/view-register.component';
import { FeedbackComponent } from './feedback/feedback.component';

export const routes: Routes = [
    {path:'',component:HomeComponent},
    {path:'login',component:LoginComponent},
    {path:'register',component:RegisterComponent},
    {path:'admin-login',component:AdminLoginComponent},
    {path:'enquiry',component:EnquiryComponent},
    {path:'view-enquiry',component:ViewEnquiryComponent},
    {path:'view-feedback',component:ViewFeedbackComponent},
    {path:'view-register',component:ViewRegisterComponent},
    {path:'feedback',component:FeedbackComponent}
    
];
