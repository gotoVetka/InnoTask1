package com.korzh.ft.validator.impl;

import com.korzh.ft.validator.CustomValidator;

import java.util.regex.Pattern;

public class CustomValidatorImpl implements CustomValidator {
  private String stringPatternRegex;

  public CustomValidatorImpl(String stringPatternRegex){
    this.stringPatternRegex = stringPatternRegex;
  }

  @Override
  public boolean isStringValid(String stringToValid) {
    Pattern pattern = Pattern.compile(stringPatternRegex);
    return pattern.matcher(stringToValid).matches();
  }
}
