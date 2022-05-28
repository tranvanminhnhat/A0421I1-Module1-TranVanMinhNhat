export class Student {
  id: number;
  studentName:string;
  groupName: string;
  areaName: string;
  instructor: string;
  email: string;
  phoneNumber: string;
  constructor(id: number, studentName: string, groupName: string, areaName: string, instructor: string, email: string, phoneNumber: string) {
    this.id = id;
    this.studentName = studentName;
    this.groupName = groupName;
    this.areaName = areaName;
    this.instructor = instructor;
    this.email = email;
    this.phoneNumber = phoneNumber;
  }
}
