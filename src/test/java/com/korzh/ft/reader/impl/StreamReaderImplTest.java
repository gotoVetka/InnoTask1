package com.korzh.ft.reader.impl;

import com.korzh.ft.reader.CustomStreamReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

class StreamReaderImplTest {
  CustomStreamReader streamReader;
  Stream<String> stringStream;
  Stream<Integer> intStream;

  @BeforeEach
  void setUp() {
    stringStream = Stream.of("123,234;345", "345,3456,1235");
    intStream = Stream.of(1,2,3,4,5);
    streamReader = new StreamReaderImpl();
  }

  @AfterEach
  void tearDown() {
    stringStream = null;
    streamReader = null;
  }

  @Test
  void readStringsFromStream() {
    ArrayList<String> expected = new ArrayList<>();
    Collections.addAll(expected, "123,234;345", "345,3456,1235");
    ArrayList<String> actual = streamReader.readStringsFromStream(stringStream);
    assert(actual.equals(expected));
  }

  @Test
  void readIntsFromStream() {
    ArrayList<Integer> expected = new ArrayList<>();
    Collections.addAll(expected, 1,2,3,4,5);
    ArrayList<Integer> actual = streamReader.readIntsFromStream(intStream);
    assert(actual.equals(expected));
  }
}