import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-navbar',
  templateUrl: './navber.component.html', // Corrected file name to match the folder structure
  styleUrls: ['./navber.component.css'], // Corrected file name to match the folder structure
  standalone: true,
  imports: [CommonModule, RouterLink]// Add any necessary imports here
})
export class NavbarComponent {
  isLoggedIn = false; // Default not logged in
  userInfo: any = null;

  constructor() {
    // Mock data, pore service theke niye asbe
    this.isLoggedIn = true;
    this.userInfo = {
      userName: 'Faysal',
      userRole: 'Employer' // Or 'JobSeeker'
    };
  }

  logoff() {
    this.isLoggedIn = false;
    this.userInfo = null;
    console.log('Logged off');
  }
}
