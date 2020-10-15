import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Defect } from '../model/defect';
import { DefectService } from '../service/defectservice';

@Component({
  selector: 'app-getalldefects',
  templateUrl: './getalldefects.component.html',
  styleUrls: ['./getalldefects.component.css']
})
export class GetalldefectsComponent implements OnInit {
  defects:Defect[];
  constructor(private defectService:DefectService) {
    let observable:Observable<Defect[]>=defectService.getAllDefects();
    observable.subscribe(
       defectsarray=>{
         this.defects=defectsarray;
         console.log(this.defects);
       },
       err=>
       {
         console.log("something is wrong in fetching results");
       }
       );
   }
   delete(id:number)
   {
     let observable=this.defectService.delete(id);
     observable.subscribe(
       res=>{
         this.removeDefect(id);
       },
       err=>
       {
         console.log("unable to remove "+err.message);
       }
     )
   }
  removeDefect(id: number) {
   for(let j=0;j<this.defects.length;j++)
   {
     let defectid=this.defects[j];
     if(defectid.id==id)
     {
       this.defects.splice(j,1);
     }
   }
  }
  ngOnInit(): void {
  }

}
