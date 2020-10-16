import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { Project } from '../model/project';
import { updateProject } from '../model/updateproject';
import { ProjectService } from '../service/projectservice';

@Component({
  selector: 'app-updateproject',
  templateUrl: './updateproject.component.html',
  styleUrls: ['./updateproject.component.css']
})
export class UpdateprojectComponent implements OnInit {
project:updateProject;
  constructor(private projectService:ProjectService) { }

  ngOnInit(): void {
  }
  updateProject(form:any)
  {
    let details=form.value;
    let projectLead=details.projectLead;
    let projectId=details.projectId;
    let projectName=details.projectName;
    let startDate=details.startDate;
    let convertTime=new Date(startDate);
    let teamCount=details.teamCount;
    this.project=new updateProject(projectId,projectName,projectLead,teamCount,convertTime.getTime());
    let observable:Observable<Project>=this.projectService.updateProject(this.project);
    observable.subscribe(
        success=>
        {
          console.log("project updated");
        }
    );

    

  }
}
