package com.korzh.ft.service;

import com.korzh.ft.entity.CustomIntArr;
import com.korzh.ft.exception.NullCollectionException;

public interface CustomIntArrService {
  int findMax(CustomIntArr customIntArr) throws NullCollectionException;
  int findMin(CustomIntArr customIntArr) throws NullCollectionException;
  int findSum(CustomIntArr customIntArr) throws NullCollectionException;
  float findAvg(CustomIntArr customIntArr) throws NullCollectionException;
  int findPositiveCount(CustomIntArr customIntArr) throws NullCollectionException;
  int findNegativeCount(CustomIntArr customIntArr) throws NullCollectionException;
  void replaceByIndex(CustomIntArr customIntArr, int index, int newValue) throws NullCollectionException;
}
