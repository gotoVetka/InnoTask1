package com.korzh.ft.reader;

import com.korzh.ft.exception.CustomException;

import java.util.ArrayList;

public interface CustomReader {
  ArrayList<String> readFromFile(String filename) throws CustomException;
}
