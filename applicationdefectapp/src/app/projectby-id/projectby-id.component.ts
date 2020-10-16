import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Project } from '../model/project';
import { ProjectService } from '../service/projectservice';

@Component({
  selector: 'app-projectby-id',
  templateUrl: './projectby-id.component.html',
  styleUrls: ['./projectby-id.component.css']
})
export class ProjectbyIdComponent implements OnInit {
project:Project;
  constructor(private projectService:ProjectService) { }
 
  projectById(form)
  {
    let details=form.value;
    let projectId=details.projectId;
    let observable:Observable<Project>=this.projectService.getProjectById(projectId);
    observable.subscribe(
      projectAr=>{
        this.project=projectAr;
      }
    );

  }

  ngOnInit(): void {
  }

}
