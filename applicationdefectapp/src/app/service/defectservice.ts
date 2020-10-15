import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { observable, Observable } from 'rxjs';
import { Defect } from '../model/defect';
@Injectable()
export class DefectService
{

    baseurl="http://localhost:7777/defects";
constructor(private http:HttpClient)
{

}
addDefect(defect:Defect):Observable<Defect>
{
    let addurl=this.baseurl+"/add";
    let result:Observable<Defect>=this.http.post<Defect>(addurl,defect);
    return result;
}
getAllDefects():Observable<Defect[]>
{
    let geturl=this.baseurl+"/getall";
    let result:Observable<Defect[]>=this.http.get<Defect[]>(geturl);
    return result;
}
delete(id:number):Observable<void>
{
    let url=this.baseurl+"/delete/"+id;
    let observable:Observable<void>=this.http.delete<void>(url);
    return observable;
}
}