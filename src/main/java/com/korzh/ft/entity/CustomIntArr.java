package com.korzh.ft.entity;

import com.korzh.ft.service.impl.CustomIntArrServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Array;
import java.util.Arrays;

public class CustomIntArr {
  private final Logger logger = LoggerFactory.getLogger(CustomIntArrServiceImpl.class);
  private int[] elements;
  private long id;

  public CustomIntArr(){};

  private CustomIntArr(Builder builder) {
    this.elements = builder.elements;
    this.id = builder.id;
  }

  public int[] getElements() {
    return elements.clone();
  }

  public void setElements(int[] elements) {
    this.elements = elements.clone();
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    CustomIntArr that = (CustomIntArr) o;
    return id == that.id && Arrays.equals(elements, that.elements);
  }

  @Override
  public int hashCode() {
    int result = Arrays.hashCode(elements);
    result = 31 * result + Long.hashCode(id);
    return result;
  }

  @Override
  public String toString() {
    return "CustomIntArr [elements=" +
            Arrays.toString(elements) +
            ", id=" + id + "]";
  }

  public Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private int[] elements = new int[0];
    private long id = 0;

    public Builder elements(int[] newElements) {
      if (elements != null) {
        this.elements = newElements.clone();
      } else {
        this.elements = new int[0];
      }
      return this;
    }

    public Builder id(long id) {
      this.id = id;
      return this;
    }

    public CustomIntArr build() {
      return new CustomIntArr(this);
    }
  }

}
