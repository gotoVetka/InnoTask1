package com.korzh.ft.entity;

import com.korzh.ft.observer.CustomIntArrayObservable;
import com.korzh.ft.observer.CustomObserver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Arrays;
import java.util.StringJoiner;

public class CustomIntArr implements CustomIntArrayObservable {
  private static final Logger logger = LogManager.getLogger();
  private int[] elements;
  private long id;
  private CustomObserver observer;

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
    if(this.observer != null){
      this.observer.update(this);
    }
  }

  public long getId() {
    return id;

  }

  public void setId(long id) {
    this.id = id;
    if(this.observer != null){
      observer.update(this);
    }
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
    StringJoiner str = new StringJoiner("|");
    return str.add(Arrays.toString(elements)).add(Long.toString(id)).toString();
  }

  @Override
  public void addObserver(CustomObserver observer) {
    if(observer != null) {
      this.observer = observer;
    }
  }

  @Override
  public void removeObserver(CustomObserver observer) {
    this.observer = null;
  }

  @Override
  public void notifyObservers() {
    if (observer != null) {
      observer.update(this);
    }
  }
  public Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private int[] elements;
    private long id;

    public Builder elements(int[] newElements) {
        if(newElements != null){
          this.elements = newElements.clone();
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
