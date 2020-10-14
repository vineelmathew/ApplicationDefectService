import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Project } from '../model/project';
import { ProjectService } from '../service/projectservice';

@Component({
  selector: 'app-addproject',
  templateUrl: './addproject.component.html',
  styleUrls: ['./addproject.component.css']
})
export class AddprojectComponent implements OnInit {
  
  project:Project 
  constructor(private projectService:ProjectService) { }

  ngOnInit(): void {
  }
  saveProject(form:any)
  {
    let details=form.value;
    let projectLead=details.projectLead;
    let projectName=details.projectName;
    let startDate=details.startDate;
    let convertTime=new Date(startDate);
    let teamCount=details.teamCount;
    this.project=new Project(projectName,projectLead,teamCount,convertTime.getTime());
    let observable:Observable<Project>=this.projectService.addProject(this.project);
    observable.subscribe(
        success=>
        {
          console.log("project added");
          console.log(success.getProjectLead,success.getProjectName,success.getStartDate,success.getTeamCount);
        }
    );

    

  }

}
