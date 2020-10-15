import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Project } from '../model/project';
import { ProjectService } from '../service/projectservice';

@Component({
  selector: 'app-getallprojects',
  templateUrl: './getallprojects.component.html',
  styleUrls: ['./getallprojects.component.css']
})
export class GetallprojectsComponent implements OnInit {
  projects:Project[]
  constructor(private projectService:ProjectService) {
    let observable:Observable<Project[]>=projectService.getAllProjects();
    observable.subscribe(
      projectsarr=>{
        this.projects=projectsarr;
        console.log(this.projects);
      },
      error=>
      {
        console.log("wrong in fetching in the results");
      }
    );
  }
   remove(id:number)
   {
     let observable=this.projectService.delete(id);
     observable.subscribe(
       res=>
       {
         this.removeProject(id);
       },
       err=>
       {
         console.log("unable to remove the project"+err.message);
       }
     )
   }
  removeProject(id:number)
  {
    for(let j=0;j<this.projects.length;j++)
   {
     let pid=this.projects[j];
     if(pid.projectId==id)
     {
       this.projects.splice(j,1);
     }
   }
  }

  ngOnInit(): void {
  }
}
