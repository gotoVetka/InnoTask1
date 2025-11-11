package com.korzh.ft.entity;

public class Arr {
  private List<Integer> ArrList;

  public List<Integer> getArrList() {
    return ArrList;
  }

  public void setArrList(List<Integer> newArrList) {
    ArrList = newArrList;
  }

  public boolean equals(Object toEquals) {
    if (toEquals == null || getClass() != toEquals.getClass()) return false;
    Arr arr = (Arr) toEquals;
    return ArrList == toEquals.ArrList;
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

    public Builder setArrList(List<Integer> newArrList) {
      Arr.this.ArrList = newArrList;
      return this;
    }

    public Arr build() {
      return Arr.this;
    }

  }
}
