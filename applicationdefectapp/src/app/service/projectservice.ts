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
getAllProjects():Observable<Project[]>
{
    let result:Observable<Project[]>=this.http.get<Project[]>(this.baseurl);
    return result;
}
delete(id:number):Observable<void>
{
    let url=this.baseurl+"/delete/"+id;
    let observable:Observable<void>=this.http.delete<void>(url);
    return observable;
}
updateProject(project:Project):Observable<Project>
{
    let updateurl=this.baseurl+"/update";
    let result:Observable<Project>=this.http.put<Project>(updateurl,project);
    return result;
}
}