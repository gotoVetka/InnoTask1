package com.korzh.ft.reader.impl;

import com.korzh.ft.reader.CustomReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TextFileReaderImplTest {
  CustomReader reader;
  @BeforeEach
  void setUp() {
    reader = new TextFileReaderImpl();
  }

  @AfterEach
  void tearDown() {
    reader = null;
  }

  @Test
  void readFromFile() {
    String[] expected = new String[]{"1; 2; 3"};
    ArrayList<String> actual = reader.readFromFile(".//.//data.txt");
    assert(Arrays.equals(expected, actual.toArray()));
  }
}