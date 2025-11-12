package com.korzh.ft;

import com.korzh.ft.entity.CustomIntArr;
import com.korzh.ft.exception.CustomNullException;
import com.korzh.ft.parcer.CustomParcer;
import com.korzh.ft.parcer.impl.TextFileParcer;
import com.korzh.ft.reader.CustomReader;
import com.korzh.ft.reader.impl.TextFileReaderImpl;
import com.korzh.ft.service.impl.CustomIntArrServiceImpl;
import com.korzh.ft.validator.CustomValidator;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws CustomNullException {
    CustomParcer parcer = new TextFileParcer();
    int[] arr = parcer.getIntArray("123 , 123; 123");
    System.out.println(Arrays.toString(arr));
  }
}
