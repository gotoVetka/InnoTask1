package com.korzh.ft.entity;

public class Arr {
  Arr next;
  Arr prev;
  int value;



  public Arr(Arr next, Arr prev, int value) {
    this.next = next;
    this.prev = prev;
    this.value = value;
  }

  public void moveNext(){
    this = this.next != null ? this.next : this;
  }

  public void moveBack(){
    this = this.prev != null ? this.prev : this;
  }

  @Override
  public String toString() {
    return "Arr{" +
            "next=" + next +
            ", prev=" + prev +
            ", value=" + value +
            '}';
  }
}
