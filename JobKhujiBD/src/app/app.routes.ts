import { Routes } from '@angular/router';
import { HomeComponent } from './page/home/home.component';
import { CreateNewJobComponent } from './page/create-new-job/create-new-job.component';
import { JobDetailsComponent } from './page/job-details/job-details.component';
import { JobListingComponent } from './page/job-listing/job-listing.component';
import { JobsComponent } from './page/jobs/jobs.component';
import { LoginComponent } from './page/login/login.component';
import { RegistrationComponent } from './page/registration/registration.component';
import { MyJobsComponent } from './page/my-jobs/my-jobs.component';

export const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'create-new-job', component: CreateNewJobComponent },
  { path: 'job-details', component: JobDetailsComponent },
  { path: 'job-listing', component: JobListingComponent },
  { path: 'jobs', component: JobsComponent },
  { path: 'my-jobs', component: MyJobsComponent },
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegistrationComponent },
  // { path: '**', redirectTo: '' } // Redirect any undefined route to home
];
