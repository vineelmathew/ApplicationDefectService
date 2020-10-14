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

@NgModule({
  declarations: [
    AppComponent,
    AddprojectComponent,
    ProjectbyIdComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,FormsModule,ReactiveFormsModule,HttpClientModule
  ],
  providers: [DefectService,ProjectService],
  bootstrap: [AppComponent]
})
export class AppModule { }
