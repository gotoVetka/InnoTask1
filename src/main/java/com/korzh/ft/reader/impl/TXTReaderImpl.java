package com.korzh.ft.reader.impl;

import com.korzh.ft.exception.CustomException;
import com.korzh.ft.reader.CustomReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class TXTReaderImpl implements CustomReader {
  private static final Logger log = LoggerFactory.getLogger(TXTReaderImpl.class);

  public ArrayList<String> readFromFile(String filename) throws CustomException{
    ArrayList<String> stringsFromFile = new ArrayList<>();
    Path path;
    if(filename != null){
      path = Path.of("src/main/resources", filename);
    } else {
      throw new CustomException("Incorrect filename");
    }
    try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
      String line;
      while ((line = reader.readLine()) != null) {
        stringsFromFile.add(line);
      }
    } catch (IOException exception) {
      log.error("Read file error: " + exception);
    }
    return stringsFromFile;
  }
}
