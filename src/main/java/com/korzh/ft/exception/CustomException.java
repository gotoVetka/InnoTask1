package com.korzh.ft.exception;

public class CustomException extends Exception {
  public CustomException(String message) {
    super(message);
  }

  public CustomException(Throwable reason) {
    super(reason);
  }

  public CustomException(Throwable reason, String message) {
    super(message, reason);
  }
}
