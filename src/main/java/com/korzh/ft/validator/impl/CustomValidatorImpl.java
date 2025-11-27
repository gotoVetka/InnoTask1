package com.korzh.ft.validator.impl;

import com.korzh.ft.validator.CustomValidator;

import java.util.regex.Pattern;

public class CustomValidatorImpl implements CustomValidator {
  private String arrayLinePatternRegex;

  public CustomValidatorImpl(String stringPatternRegex){
    this.arrayLinePatternRegex = stringPatternRegex;
  }

  @Override
  public boolean isStringValid(String stringToValid) {
    Pattern pattern = Pattern.compile(arrayLinePatternRegex);
    return pattern.matcher(stringToValid).matches();
  }
}
