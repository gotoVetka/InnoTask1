package com.korzh.ft.parser.impl;

import com.korzh.ft.parser.CustomParcer;

public class TextFileParcer implements CustomParcer {
  public int[] getIntArray(String stringToParse) {
      String[] subStrings = stringToParse.split("\\s*[;,]\\s*");
      int[] parseResult = new int[subStrings.length];
      for(int i = 0; i < parseResult.length; i++){
        parseResult[i] = Integer.parseInt(subStrings[i]);
      }
      return parseResult;
  }
}
