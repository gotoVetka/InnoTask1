package com.korzh.ft.service.impl;

import com.korzh.ft.entity.Student;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceImplTest {

  Student[] students = {new Student(5, "aaa", 20), new Student(6, "bbb", 23)};

  @org.junit.jupiter.api.BeforeEach
  void setUp() {
  }

  @org.junit.jupiter.api.AfterEach
  void tearDown() {
  }

  @org.junit.jupiter.api.Test
  void findMaxAgeForStudent() {
    int expected = 23;
    StudentServiceImpl service = new StudentServiceImpl();
    int actual = service.findMaxAgeForStudent(students);
    assertEquals(expected, actual);
  }

  @org.junit.jupiter.api.Test
  void findMinAgeForStudent() {
  }

  @org.junit.jupiter.api.Test
  void findStudentId() {
  }
}