package com.korzh.ft.service;

import com.korzh.ft.entity.CustomIntArr;
import com.korzh.ft.exception.CustomNullException;

public interface CustomIntArrService {
  int findMax(CustomIntArr customIntArr) throws CustomNullException;
  int findMin(CustomIntArr customIntArr) throws CustomNullException;
  int findSum(CustomIntArr customIntArr) throws CustomNullException;
  float findAvg(CustomIntArr customIntArr) throws CustomNullException;
  int findPositiveCount(CustomIntArr customIntArr) throws CustomNullException;
  int findNegativeCount(CustomIntArr customIntArr) throws CustomNullException;
  void replaceByIndex(CustomIntArr customIntArr, int index, int newValue) throws CustomNullException;
}
