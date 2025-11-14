package com.korzh.ft;

import com.korzh.ft.exception.CustomNullException;
import com.korzh.ft.parser.CustomParcer;
import com.korzh.ft.parser.impl.TextFileParcer;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws CustomNullException {
    CustomParcer parcer = new TextFileParcer();
    int[] arr = parcer.getIntArray("123 , 123; 123");
    System.out.println(Arrays.toString(arr));
  }
}
