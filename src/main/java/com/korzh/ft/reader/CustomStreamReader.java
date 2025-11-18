package com.korzh.ft.reader;

import java.util.ArrayList;
import java.util.stream.Stream;

public interface CustomStreamReader {
  ArrayList<String> readStringsFromStream(Stream<String> stream);
  ArrayList<Integer> readIntsFromStream(Stream<Integer> stream);
}
