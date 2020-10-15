import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AdddefectComponent } from './adddefect/adddefect.component';
import { AddprojectComponent } from './addproject/addproject.component';
import { GetalldefectsComponent } from './getalldefects/getalldefects.component';
import { ProjectbyIdComponent } from './projectby-id/projectby-id.component';

const routes: Routes = [
  {
    path:"app-addproject",
    component:AddprojectComponent
  },
  {
    path:"app-adddefect",
    component:AdddefectComponent
  },
  {
    path:"app-projectby-id",
    component:ProjectbyIdComponent
  },
  {
    path:"app-getalldefects",
    component:GetalldefectsComponent
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
