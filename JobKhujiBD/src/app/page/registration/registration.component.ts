import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css'],
  standalone: true,
  imports: [FormsModule,CommonModule],
})
export class RegistrationComponent {
  isJobSeeker = true;

  JobSeekerObj = {
    FullName: '',
    EmailId: '',
    MobileNo: '',
    ExperienceStatus: '',
    ResumeUrl: '',
  };

  employerObj = {
    CompanyName: '',
    EmailId: '',
    MobileNo: '',
    PhoneNo: '',
    LogoURL: '',
    GstNo: '',
    City: '',
    State: '',
    PinCode: '',
    CompanyAddress: '',
  };

  registerAsJobSeeker() {
    console.log('Registering Job Seeker:', this.JobSeekerObj);
    // Backend call code here
  }

  register() {
    console.log('Registering Employer:', this.employerObj);
    // Backend call code here
  }
}
