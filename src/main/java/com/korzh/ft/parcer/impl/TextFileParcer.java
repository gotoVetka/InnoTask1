package com.korzh.ft.parcer.impl;

import com.korzh.ft.parcer.CustomParcer;
import com.korzh.ft.reader.CustomReader;
import com.korzh.ft.validator.CustomValidator;

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
