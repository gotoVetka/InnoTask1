package com.korzh.ft.specification.impl;

import com.korzh.ft.entity.CustomIntArr;
import com.korzh.ft.specification.CustomSpecification;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdSpecificationTest {

  CustomIntArr customIntArr;
  CustomSpecification spec;
  @BeforeEach
  void setUp() {
    customIntArr = new CustomIntArr().builder().elements(new int[]{1,2,3,4}).id(123).build();
    spec = new IdSpecification(123);
  }

  @AfterEach
  void tearDown() {
    customIntArr = null;
    spec = null;
  }

  @Test
  void specify() {
    assert(spec.specify(customIntArr));
  }
}