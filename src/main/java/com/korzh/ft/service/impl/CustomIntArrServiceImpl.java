package com.korzh.ft.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.korzh.ft.entity.CustomIntArr;
import com.korzh.ft.exception.CustomException;
import com.korzh.ft.service.CustomIntArrService;

import java.util.Arrays;

public class CustomIntArrServiceImpl implements CustomIntArrService{
  private final Logger logger = LoggerFactory.getLogger(CustomIntArrServiceImpl.class);

  @Override
  public int findMax(CustomIntArr customIntArr) throws CustomException {
    if (customIntArr == null || customIntArr.getElements() == null) {
      throw new CustomException("CustomIntArr is null");
    }
    int[] tmpArray = customIntArr.getElements();
    int max = tmpArray[0];
    for(int elem : customIntArr.getElements()){
      if(elem>max)max = elem;
    }
    return max;
  }

  @Override
  public int findMin(CustomIntArr customIntArr) throws CustomException {
    if (customIntArr == null || customIntArr.getElements() == null) {
      throw new CustomException("CustomIntArr is null");
    }
    int[] tmpArray = customIntArr.getElements();
    int min = tmpArray[0];
    for(int elem : tmpArray){
      if(min > elem)min = elem;
    }
    return min;
  }

  @Override
  public int findSum(CustomIntArr customIntArr) throws CustomException {
    if (customIntArr == null || customIntArr.getElements() == null) {
      throw new CustomException("CustomIntArr is null");
    }
    int sum = 0;
    for(int elem : customIntArr.getElements()){
      sum += elem;
    }
    return sum;
  }

  @Override
  public float findAvg(CustomIntArr customIntArr) throws CustomException {
    if (customIntArr == null || customIntArr.getElements() == null) {
      throw new CustomException("CustomIntArr is null");
    }
    int[] tmpArray = customIntArr.getElements();
    if(tmpArray.length == 0){
      return 0;
    }
    float result = 0;
    for (int elem : tmpArray) {
      result += elem;
    }
    return result / tmpArray.length;
  }

  @Override
  public int findPositiveCount(CustomIntArr customIntArr) throws CustomException {
    if (customIntArr == null || customIntArr.getElements() == null) {
      throw new CustomException("CustomIntArr is null");
    }
    int result = 0;
    for(int elem : customIntArr.getElements()){
      if(elem > 0){
        result++;
      }
    }
    return result;
  }

  @Override
  public int findNegativeCount(CustomIntArr customIntArr) throws CustomException {
    if (customIntArr == null || customIntArr.getElements() == null) {
      throw new CustomException("CustomIntArr is null");
    }
    int result = 0;
    for(int elem : customIntArr.getElements()){
      if(elem < 0){
        result++;
      }
    }
    return result;
  }

  @Override
  public void replaceByIndex(CustomIntArr customIntArr, int index, int value) throws CustomException {
    if (customIntArr == null || customIntArr.getElements() == null) {
      throw new CustomException("CustomIntArr is null");
    }
    int[] result = customIntArr.getElements();
    if(index < 0 || index >= customIntArr.getElements().length) {
      logger.warn(customIntArr.toString() + "Index out of range");
      return;
    }
    result[index] = value;
    customIntArr.setElements(result);
  }
  @Override
  public void bubbleSort(CustomIntArr customIntArr) throws CustomException{ // Bubble
    if (customIntArr == null || customIntArr.getElements() == null) {
      throw new CustomException("CustomIntArr is null");
    }
    int[] array = customIntArr.getElements();
    if ( array.length == 0 ){
      return;
    }
    for (int i = 1; i < array.length; i++) {
      int key = array[i];
      int j = i - 1;
      while (j >= 0 && array[j] > key) {
        array[j + 1] = array[j];
        j--;
      }
      array[j + 1] = key;
    }
    customIntArr.setElements(array);
  }
}
