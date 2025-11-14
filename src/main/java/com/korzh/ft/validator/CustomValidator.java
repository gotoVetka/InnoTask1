package com.korzh.ft.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
// ^\s*[0-9]+(?:\s*[;,]\s*[0-9]+)*\s*$
public class CustomValidator {
  private static final String VALID_REGEX;
  public CustomValidator(String validRegex){
  }
  public boolean isStringValid(String stringToValid){
    matcher = pattern.matcher(stringToValid);
    return matcher.find();
  }
}
