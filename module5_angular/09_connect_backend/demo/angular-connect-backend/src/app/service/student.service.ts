import { Injectable } from '@angular/core';
import {Student} from "../model/student";
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class StudentService {
  public apiURL = "http://localhost:3000/students";
  constructor(private http: HttpClient) {
  }
  createStudent(value:Student):Observable<any> {
    return this.http.post<any>(this.apiURL,value)
  }
  findAll(): Observable<Student[]> {
    return this.http.get<Student[]>(this.apiURL);
  }

  findById(id: number): Observable<Student> {
    return this.http.get<Student>(this.apiURL + "/" + id);
  }

  updateStudent(student: Student): Observable<any> {
    return this.http.patch<any>(this.apiURL+"/"+ student.id, student)
  }
  // searchStudent(name: string) {
  //   return this.http.get<any>(this.apiURL + '?name_like=' + name)
  //
  // }
  deleteStudent(student: Student): Observable<any> {
    return this.http.delete<any>(this.apiURL+"/"+ student.id)
  }
}
