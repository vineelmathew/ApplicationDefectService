import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Defect } from '../model/defect';
import { updateDefect } from '../model/updatedefect';
import { DefectService } from '../service/defectservice';

@Component({
  selector: 'app-updatedefect',
  templateUrl: './updatedefect.component.html',
  styleUrls: ['./updatedefect.component.css']
})
export class UpdatedefectComponent implements OnInit {
defect:updateDefect
public selectedOption:string;
  constructor(private defectService:DefectService) { }
  updateDefect(form:any)
  {
    let details=form.value;
    let summary=details.summary;
    let defectId=details.defectId;
    let defectDate=details.defectDate;
    let convertDate=new Date(defectDate);
    let projectId=details.projectId;
    this.defect=new updateDefect(defectId,summary,this.selectedOption,convertDate.getTime(),projectId);
    let observable:Observable<Defect>=this.defectService.updateDefect(this.defect);
    observable.subscribe(
       success=>
       {
         console.log("defect updated");
       }
    );
  }

  ngOnInit(): void {
  }

}
