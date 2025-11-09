package com.korzh.ft.entity;

public class Student {

  private long studentId;
  private String lastname;
  private int age;

  public Student(long studentId, String lastname, int age) {
    this.studentId = studentId;
    this.lastname = lastname;
    this.age = age;
  }

  public long getStudentId() {
    return studentId;
  }

  public void setStudentId(long studentId) {
    this.studentId = studentId;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;

    Student student = (Student) o;
    return studentId == student.studentId && age == student.age && lastname.equals(student.lastname);
  }

  @Override
  public int hashCode() {
    int result = Long.hashCode(studentId);
    result = 31 * result + lastname.hashCode();
    result = 31 * result + age;
    return result;
  }
}
