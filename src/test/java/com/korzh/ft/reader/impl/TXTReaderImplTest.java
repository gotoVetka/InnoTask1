package com.korzh.ft.reader.impl;

import com.korzh.ft.exception.CustomException;
import com.korzh.ft.reader.CustomReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

class TXTReaderImplTest {
  CustomReader reader;
  @BeforeEach
  void setUp() {
    reader = new TXTReaderImpl();
  }

  @AfterEach
  void tearDown() {
    reader = null;
  }

  @Test
  void readFromFile() throws CustomException {
    String[] expected = new String[]{"1; 2; 3"};
    ArrayList<String> actual = reader.readFromFile("test.txt");
    assert(Arrays.equals(expected, actual.toArray()));
  }
}