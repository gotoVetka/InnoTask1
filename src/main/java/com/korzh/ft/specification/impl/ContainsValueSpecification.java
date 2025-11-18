package com.korzh.ft.specification.impl;

import com.korzh.ft.entity.CustomIntArr;
import com.korzh.ft.specification.CustomSpecification;

import java.util.Arrays;

public record ContainsValueSpecification(int value) implements CustomSpecification {
  @Override
  public boolean specify(CustomIntArr customArray) {
    return Arrays.stream(customArray.getElements()).anyMatch(elem -> elem == value );
  }
}
