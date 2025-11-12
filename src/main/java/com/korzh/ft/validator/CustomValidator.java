package com.korzh.ft.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
// ^\s*[0-9]+(?:\s*[;,]\s*[0-9]+)*\s*$
public class CustomValidator {
  private String VALID_REGEX;
  Pattern pattern;
  Matcher matcher;
  public boolean isStringValid(String stringToValid){
    matcher = pattern.matcher(stringToValid);
    return matcher.find();
  }
  public CustomValidator(String validRegex){
    this.VALID_REGEX = validRegex;
    this.pattern = Pattern.compile(VALID_REGEX, Pattern.CASE_INSENSITIVE);
  }
}
