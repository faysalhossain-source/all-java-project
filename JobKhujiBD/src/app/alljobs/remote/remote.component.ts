import { NgFor } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { RouterModule } from '@angular/router';

interface Job {
  id: number;
  name: string;
  description?: string;
  image?: string;
}

@Component({
  selector: 'app-remote-jobs',
  templateUrl: './remote.component.html',
  styleUrls: ['./remote.component.css'],
  imports:[RouterModule, NgFor]
})
export class RemoteJobsComponent implements OnInit {

  jobs: Job[] = [];

  ngOnInit(): void {
    this.jobs = [
      {
        id: 1,
        name: 'Frontend Developer',
        description: 'Build beautiful UIs using Angular and TailwindCSS.',
        image: 'assets/jobs/frontend.png'
      },
      {
        id: 2,
        name: 'Remote Data Analyst',
        description: 'Analyze and visualize data for real-time dashboards.',
        image: 'assets/jobs/data-analyst.png'
      },
      {
        id: 3,
        name: 'Virtual Assistant',
        description: 'Provide online administrative support to our global clients.',
        image: 'assets/jobs/virtual-assistant.png'
      }
      // Add more jobs here...
    ];
  }

}
