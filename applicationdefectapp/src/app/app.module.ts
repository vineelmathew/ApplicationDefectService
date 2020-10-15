import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddprojectComponent } from './addproject/addproject.component';
import { DefectService } from './service/defectservice';
import { ProjectService } from './service/projectservice';
import { HttpClientModule } from '@angular/common/http';
import { ProjectbyIdComponent } from './projectby-id/projectby-id.component';
import { AdddefectComponent } from './adddefect/adddefect.component';
import { GetalldefectsComponent } from './getalldefects/getalldefects.component';
import { GetallprojectsComponent } from './getallprojects/getallprojects.component';
import { UpdateprojectComponent } from './updateproject/updateproject.component';
import { UpdatedefectComponent } from './updatedefect/updatedefect.component';
import { DefectbyIdComponent } from './defectby-id/defectby-id.component';

@NgModule({
  declarations: [
    AppComponent,
    AddprojectComponent,
    ProjectbyIdComponent,
    AdddefectComponent,
    GetalldefectsComponent,
    GetallprojectsComponent,
    UpdateprojectComponent,
    UpdatedefectComponent,
    DefectbyIdComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,FormsModule,ReactiveFormsModule,HttpClientModule
  ],
  providers: [DefectService,ProjectService],
  bootstrap: [AppComponent]
})
export class AppModule { }
