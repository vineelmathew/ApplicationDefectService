import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Project } from '../model/project';
import { Observable } from 'rxjs';
@Injectable()
export class ProjectService{
baseurl="http://localhost:8888/projects";
constructor(private http:HttpClient)
{

}
addProject(project:Project):Observable<Project>
{
    let addurl=this.baseurl+"/add";
    let result:Observable<Project>=this.http.post<Project>(addurl,project);
    return result;
}

}