import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { StudentInfoComponent } from './student-info/student-info.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { StudentListComponent } from './student-list/student-list.component';
import { StudentCreateComponent } from './student-create/student-create.component';
import {HttpClientModule} from "@angular/common/http";
import { StudentUpdateComponent } from './student-update/student-update.component';

@NgModule({
  declarations: [
    AppComponent,
    StudentInfoComponent,
    StudentListComponent,
    StudentCreateComponent,
    StudentUpdateComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
