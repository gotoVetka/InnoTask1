package com.korzh.ft.reader;

import com.korzh.ft.exception.CustomException;

import java.util.ArrayList;

public interface CustomFileReader {
  ArrayList<String> readStringsfromfile(String filename) throws CustomException;
}
