package com.korzh.ft.reader.impl;

import com.korzh.ft.exception.CustomException;
import com.korzh.ft.reader.CustomFileReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

class TXTReaderImplTest {
  CustomFileReader reader;
  @BeforeEach
  void setUp() {
    reader = new TXTFileReaderImpl();
  }

  @AfterEach
  void tearDown() {
    reader = null;
  }

  @Test
  void readFromFile() throws CustomException {
    String[] expected = new String[]{"1; 2; 3"};
    ArrayList<String> actual = reader.readStringsfromfile("test.txt");
    assert(Arrays.equals(expected, actual.toArray()));
  }
}