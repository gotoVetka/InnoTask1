package com.korzh.ft.specification.impl;

import com.korzh.ft.entity.CustomIntArr;
import com.korzh.ft.specification.CustomSpecification;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContainsValueSpecificationTest {
  CustomSpecification spec;
  CustomIntArr customIntArr;
  @BeforeEach
  void setUp() {
    customIntArr = new CustomIntArr().builder().elements(new int[]{1,2,3,45}).id(123).build();
    spec = new ContainsValueSpecification(2);
  }

  @AfterEach
  void tearDown(){
    spec = null;
    customIntArr = null;
  }

  @Test
  void specify() {
    assert(spec.specify(customIntArr));
  }
}