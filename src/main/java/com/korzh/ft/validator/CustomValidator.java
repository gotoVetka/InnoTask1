package com.korzh.ft.validator;

// ^\s*[0-9]+(?:\s*[;,]\s*[0-9]+)*\s*$
public interface CustomValidator {
  public boolean isStringValid(String stringToValid);
}
