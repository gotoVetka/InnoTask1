package com.korzh.ft.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
// ^\s*[0-9]+(?:\s*[;,]\s*[0-9]+)*\s*$
public interface CustomValidator {
  public boolean isStringValid(String stringToValid);
}
