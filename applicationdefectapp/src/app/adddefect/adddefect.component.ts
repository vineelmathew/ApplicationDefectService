import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Defect } from '../model/defect';
import { DefectService } from '../service/defectservice';

@Component({
  selector: 'app-adddefect',
  templateUrl: './adddefect.component.html',
  styleUrls: ['./adddefect.component.css']
})
export class AdddefectComponent implements OnInit {
defect:Defect

public selectedOption:string;


  constructor(private defectService:DefectService) { }

  ngOnInit(): void {
  }
  addDefect(form:any)
  {
    let details=form.value;
    let summary=details.summary;
    let defectDate=details.defectDate;
    let convertDate=new Date(defectDate);
    let projectId=details.projectId;
    this.defect=new Defect(summary,this.selectedOption,convertDate.getTime(),projectId);
    let observable:Observable<Defect>=this.defectService.addDefect(this.defect);
    observable.subscribe(
       success=>
       {
         console.log("defect added");
       }
    );
  }
}
