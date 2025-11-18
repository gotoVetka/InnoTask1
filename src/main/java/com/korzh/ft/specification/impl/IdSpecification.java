package com.korzh.ft.specification.impl;

import com.korzh.ft.entity.CustomIntArr;
import com.korzh.ft.specification.CustomSpecification;

public record IdSpecification(int id) implements CustomSpecification {
  @Override
  public boolean specify(CustomIntArr customArray) {
    return customArray.getId() == id;
  }
}
