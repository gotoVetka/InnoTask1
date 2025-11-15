package com.korzh.ft.parser.impl;

import com.korzh.ft.parser.CustomParser;

public class CustomParserImpl implements CustomParser {
  public int[] parseIntArray(String stringToParse) {
    final String SPLITTER_REGEX = "\\s*[;,]\\s*";
    String[] subStrings = stringToParse.split(SPLITTER_REGEX);
    int[] parseResult = new int[subStrings.length];
    for(int i = 0; i < parseResult.length; i++){
      parseResult[i] = Integer.parseInt(subStrings[i]);
    }
    return parseResult;
  }
}
