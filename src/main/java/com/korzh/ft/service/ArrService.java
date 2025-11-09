package com.korzh.ft.service;

import com.korzh.ft.entity.Arr;

public interface ArrService {
  int findMinInArr(Arr start);
  int findMaxInArr(Arr start);
  void findAvgInArr(Arr start);
  int findArrSum(Arr start);
  int findPositiveCount(Arr start);
  int findNegativeCount(Arr start);
}
