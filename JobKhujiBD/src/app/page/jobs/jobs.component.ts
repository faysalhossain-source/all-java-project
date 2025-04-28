import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-jobs',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './jobs.component.html',
  styleUrls: ['./jobs.component.css'],
})
export class JobsComponent {
  jobList = [
    {
      jobId: 1,
      jobName: 'Frontend Developer',
      companyName: 'ABC Tech',
      logoURL: 'https://via.placeholder.com/50',
      experience: '2-4 years',
      package: '💰 6–8 Lakh Taka Per Year',
      location: 'Dhaka',
    },
    {
      jobId: 2,
      jobName: 'Backend Developer',
      companyName: 'XYZ Solutions',
      logoURL: 'https://via.placeholder.com/50',
      experience: '1-3 years',
      package: '💰 5–7 Lakh Taka Per Year',
      location: 'Chattogram',
    },
    {
      jobId: 3,
      jobName: 'Full Stack Developer',
      companyName: 'Tech Innovators',
      logoURL: 'https://via.placeholder.com/50',
      experience: '3-5 years',
      package: '💰 8–10 Lakh Taka Per Year',
      location: 'Sylhet',
    },
    {
      jobId: 4,
      jobName: 'Data Scientist',
      companyName: 'Data Insights',
      logoURL: 'https://via.placeholder.com/50',
      experience: '2-4 years',
      package: '💰 7–9 Lakh Taka Per Year',
      location: 'Rajshahi',
    },
    {
      jobId: 5,
      jobName: 'UI/UX Designer',
      companyName: 'Creative Minds',
      logoURL: 'https://via.placeholder.com/50',
      experience: '1-2 years',
      package: '💰 4–5 Lakh Taka Per Year',
      location: 'Khulna',
    },
  ];

  openJob(jobId: number) {
    console.log('Opening job with ID:', jobId);
  }
}
