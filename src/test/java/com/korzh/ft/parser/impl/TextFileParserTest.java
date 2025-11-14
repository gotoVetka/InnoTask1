package com.korzh.ft.parser.impl;

import com.korzh.ft.parser.CustomParcer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TextFileParcerTest {
  CustomParcer parcer;
  @BeforeEach
  void setUp() {
    parcer = new TextFileParcer();
  }

  @AfterEach
  void tearDown() {
    parcer = null;
  }

  @Test
  void getIntArray() {
    int[] expected = new int[]{123,123,123};
    int[] actual = parcer.getIntArray("123;123,123");
    assert(Arrays.equals(expected, actual));
  }
}