package com.korzh.ft.reader.impl;

import com.korzh.ft.reader.CustomStreamReader;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamReaderImpl implements CustomStreamReader {
  public ArrayList<String> readStringsFromStream(Stream<String> stream){
    return new ArrayList<String>(stream.toList());
  }
  public ArrayList<Integer> readIntsFromStream(Stream<Integer> stream){
    return new ArrayList<Integer>(stream.toList());
  }
}
