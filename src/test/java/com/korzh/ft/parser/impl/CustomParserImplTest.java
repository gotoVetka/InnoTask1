package com.korzh.ft.parser.impl;

import com.korzh.ft.parser.CustomParser;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

class CustomParserImplTest {
  CustomParser parser;
  @BeforeEach
  void setUp() {
    parser = new CustomParserImpl();
  }

  @AfterEach
  void tearDown() {
    parser = null;
  }

  @ParameterizedTest(name = "{index} - {0}")
  @ValueSource(strings = {"123,345; 456"})
  void parseIntArray(String stringToParse) {
    int[] actual = parser.parseIntArray(stringToParse);
    assert(Arrays.equals(new int[]{123, 345, 456}, actual));
  }
}