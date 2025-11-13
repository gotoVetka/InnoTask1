package com.korzh.ft.validator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomValidatorTest {
  CustomValidator validator;
  @BeforeEach
  void setUp() {
    validator = new CustomValidator("^\\s*[0-9]+(?:\\s*[;,]\\s*[0-9]+)*\\s*$");
  }

  @AfterEach
  void tearDown() {
    validator = null;
  }

  @Test
  void isStringValid() {
    String tmpString = "1;23,34";
    boolean expected = true;
    boolean actual = validator.isStringValid(tmpString);
    assertEquals(expected, actual);
  }
}