package com.korzh.ft.validator;

import com.korzh.ft.validator.impl.CustomValidatorImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CustomValidatorImplTest {
  CustomValidator validator;
  @BeforeEach
  void setUp() {
    validator = new CustomValidatorImpl("^\\s*[0-9]+(?:\\s*[;,]\\s*[0-9]+)*\\s*$");
  }

  @AfterEach
  void tearDown() {
    validator = null;
  }


  @ParameterizedTest(name = "{index} - {0} is valid")
  @ValueSource(strings = {"123,43;45", "12  ,3 ;  45  ", "123 ; 123 ,123"})
  void isStringValid(String word) {
    assertTrue(validator.isStringValid(word));
  }
}