import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { RegisterRequest, UserService } from '../../../services/user.service';

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
    fullName: '',
    EmailId: '',
    Password: '',
    MobileNo: '',
    ExperienceStatus: '',
    ResumeUrl: '',
  };

  employerObj = {
    CompanyName: '',
    EmailId: '',
    Password: '',
    MobileNo: '',
    PhoneNo: '',
    LogoURL: '',
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



  user: RegisterRequest = {
    email: '',
    password: '',
    role: 'JOBSEEKER',
    fullName: '',
    companyName: '',
    mobile: ''
  };
  confirmPassword = '';
  registrationSuccess = false;
  registrationError = '';

  constructor(
    private router: Router,
    private userService: UserService,
  ) { }

  onSubmit() {
    if (this.user.password === this.confirmPassword) {
      this.userService.registerUser(this.user).subscribe({
        next: (response) => {
          console.log('Registration successful:', response);
          this.registrationSuccess = true;
          this.registrationError = '';
          alert('Registration successful! Please log in.');
          this.router.navigate(['/']);
        },
        error: (error: Error) => {
          console.error('Registration error:', error.message);
          this.registrationError = error.message;
          this.registrationSuccess = false;
          alert(error.message);
        },
      });
    } else {
      this.registrationError = 'Passwords do not match.';
      this.registrationSuccess = false;
      alert('Passwords do not match.');
    }
  }
}


