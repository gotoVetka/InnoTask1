package com.korzh.ft.service;

import com.korzh.ft.entity.CustomIntArr;
import com.korzh.ft.exception.CustomException;

public interface CustomIntArrService {
  int findMax(CustomIntArr customIntArr) throws CustomException;
  int findMin(CustomIntArr customIntArr) throws CustomException;
  int findSum(CustomIntArr customIntArr) throws CustomException;
  float findAvg(CustomIntArr customIntArr) throws CustomException;
  int findPositiveCount(CustomIntArr customIntArr) throws CustomException;
  int findNegativeCount(CustomIntArr customIntArr) throws CustomException;
  void replaceByIndex(CustomIntArr customIntArr, int index, int newValue) throws CustomException;
  void bubbleSort(CustomIntArr customIntArr) throws CustomException;
}
