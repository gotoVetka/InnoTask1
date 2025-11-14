package com.korzh.ft.reader.impl;

import com.korzh.ft.exception.CustomException;
import com.korzh.ft.exception.CustomNullException;
import com.korzh.ft.reader.CustomReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class TextFileReaderImpl implements CustomReader {
  private static final Logger log = LoggerFactory.getLogger(TextFileReaderImpl.class);

  public ArrayList<String> readFromFile(String filepath) throws CustomException{
    ArrayList<String> stringsFromFile = new ArrayList<>();
    Path path;
    if(filepath != null){
      path = Path.of(filepath);
    } else {
      throw new CustomException("Incorrect filepath");
    }
    try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
      String line;
      while ((line = reader.readLine()) != null) {
        stringsFromFile.add(line);
      }
    } catch (IOException e) {
      log.error("Read file error: " + filepath);
    }
    return stringsFromFile;
  }
}
