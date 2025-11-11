package com.korzh.ft.entity;

import java.util.ArrayList;

public class Arr {
  private ArrayList<Integer> ArrList;

  public ArrayList<Integer> getArrList() {
    return ArrList;
  }

  public void setArrList(ArrayList<Integer> newArrList) {
    ArrList = newArrList;
  }

  public boolean equals(Object toEquals) {
    if (toEquals == null || getClass() != toEquals.getClass()) return false;
    Arr arr = (Arr) toEquals;
    return ArrList == arr.ArrList;
  }

  public int hashCode() {
    int result = 0;
    result = 31 * result + ArrList.hashCode();
    return result;
  }
  public static Builder newBuilder() {
    return new Arr().new Builder();
  }

  public class Builder {

    private Builder() {
    }

    public Builder setArrList(ArrayList<Integer> newArrList) {
      Arr.this.ArrList = newArrList;
      return this;
    }

    public Arr build() {
      return Arr.this;
    }

  }
}
