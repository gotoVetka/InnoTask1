package com.korzh.ft.service.impl;

import com.korzh.ft.entity.Arr;
import com.korzh.ft.service.ArrService;

public class ArrServiceImpl implements ArrService {
  public int findMinInArr(Arr myArr){
    int result = 0;
    for(Integer elem : myArr.getArrList()){
      result = elem <= result ? elem : result;
    }
    return result;
  }
  public int findMaxInArr(Arr myArr){
    int result = 0;
    for(Integer elem : myArr.getArrList()){
      result = elem >= result ? elem : result;
    }
    return result;
  }
  public float findAvgInArr(Arr myArr){
    float arr_sum = 0;
    int arr_size = 0;
    for(Integer elem : myArr.getArrList()){
      arr_sum += elem;
      arr_size++;
    }
    return arr_sum/arr_size;
  }
  public int findArrSum(Arr myArr){
    int result = 0;
    for(Integer elem : myArr.getArrList()){
      result += elem;
    }
    return result;
  }
  public int findPositiveCount(Arr myArr){
    int positiveCount = 0;
    for(Integer elem : myArr.getArrList()){
      if(elem > 0)positiveCount++;
    }
    return positiveCount;
  }
  public int findNegativeCount(Arr myArr){
    int negativeCount = 0;
    for(Integer elem : myArr.getArrList()){
      if(elem < 0)negativeCount++;
    }
    return negativeCount;
  }
}
