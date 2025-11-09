package com.korzh.ft.service;

import com.korzh.ft.entity.Student;

public interface StudentService {
  int findMaxAgeForStudent(Student[] student);
  int findMinAgeForStudent(Student[] student);
  int findStudentId(Student[] student);

}
