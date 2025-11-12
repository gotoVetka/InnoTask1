package com.korzh.ft.service.impl;

import com.korzh.ft.exception.CustomNullException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.korzh.ft.entity.CustomIntArr;
import com.korzh.ft.service.CustomIntArrService;

import java.util.Arrays;

public class CustomIntArrServiceImpl implements CustomIntArrService{
  private final Logger logger = LoggerFactory.getLogger(CustomIntArrServiceImpl.class);
  final String ARR_IS_NULL = "Arr is null";


  @Override
  public int findMax(CustomIntArr customIntArr) throws CustomNullException {
    if (customIntArr.getElements() == null || Arrays.equals(customIntArr.getElements(), new int[0])) {
      throw new CustomNullException(ARR_IS_NULL);
    }
    int max = 0;
    int[] tmpArr = customIntArr.getElements();
    for(int elem : tmpArr){
      if(elem>max)max = elem;
    }
    return max;
  }

  @Override
  public int findMin(CustomIntArr customIntArr) throws CustomNullException {
    if (customIntArr.getElements() == null || Arrays.equals(customIntArr.getElements(), new int[0])) {
      throw new CustomNullException(ARR_IS_NULL);
    }
    int[] tmpArr = customIntArr.getElements();
    int min = tmpArr[0];
    for(int elem : tmpArr){
      if(min>elem)min = elem;
    }
    return min;
  }

  @Override
  public int findSum(CustomIntArr customIntArr) throws CustomNullException {
    if (customIntArr.getElements() == null || Arrays.equals(customIntArr.getElements(), new int[0])) {
      throw new CustomNullException(ARR_IS_NULL);
    }
    int result = 0;
    int[] tmpArr = customIntArr.getElements();
    for(int elem : tmpArr){
      result += elem;
    }
    return result;
  }

  @Override
  public float findAvg(CustomIntArr customIntArr) throws CustomNullException {
    if (customIntArr.getElements() == null || Arrays.equals(customIntArr.getElements(), new int[0])) {
      throw new CustomNullException(ARR_IS_NULL);
    }
    float result = 0;
    int[] tmpArr = customIntArr.getElements();
    for (int elem : tmpArr) {
      result += elem;
    }
    return result / tmpArr.length;
  }

  @Override
  public int findPositiveCount(CustomIntArr customIntArr) throws CustomNullException {
    if (customIntArr.getElements() == null || Arrays.equals(customIntArr.getElements(), new int[0])) {
      throw new CustomNullException(ARR_IS_NULL);
    }
    int result = 0;
    for(int elem : customIntArr.getElements()){
      if(elem > 0)result++;
    }
    return result;
  }

  @Override
  public int findNegativeCount(CustomIntArr customIntArr) throws CustomNullException {
    if (customIntArr.getElements() == null || Arrays.equals(customIntArr.getElements(), new int[0])) {
      throw new CustomNullException(ARR_IS_NULL);
    }
    int result = 0;
    for(int elem : customIntArr.getElements()){
      if(elem < 0)result++;
    }
    return result;
  }

  @Override
  public void replaceByIndex(CustomIntArr customIntArr, int index, int value) throws CustomNullException {
    if (customIntArr.getElements() == null || Arrays.equals(customIntArr.getElements(), new int[0])) {
      throw new CustomNullException(ARR_IS_NULL);
    }
    int[] result = customIntArr.getElements();
    if(index < 0 || index >= customIntArr.getElements().length) {
      logger.warn(customIntArr.toString() + "Index out of range");
      return;
    }
    result[index] = value;
    customIntArr.setElements(result);
  }
}
