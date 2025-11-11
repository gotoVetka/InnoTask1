package com.korzh.ft.service;

import com.korzh.ft.entity.Arr;

public interface ArrService {
  int findMinInArr(Arr myArr);
  int findMaxInArr(Arr myArr);
  float findAvgInArr(Arr myArr);
  int findArrSum(Arr myArr);
  int findPositiveCount(Arr myArr);
  int findNegativeCount(Arr myArr);
}
