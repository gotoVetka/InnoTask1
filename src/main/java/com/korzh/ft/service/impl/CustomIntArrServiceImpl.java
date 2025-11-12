package com.korzh.ft.service.impl;

import com.korzh.ft.exception.CustomNullException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.korzh.ft.entity.CustomIntArr;
import com.korzh.ft.service.CustomIntArrService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CustomIntArrServiceImpl implements CustomIntArrService{
  private final Logger logger = LoggerFactory.getLogger(CustomIntArrServiceImpl.class);
  final String ARR_IS_NULL = "Arr is null";


  @Override
  public int findMax(CustomIntArr customIntArr) throws CustomNullException {
    if (customIntArr.getElements() == null || Arrays.equals(customIntArr.getElements(), new int[0])) {
      throw new CustomNullException(ARR_IS_NULL);
    }
    int max = 0;
    for(int elem : customIntArr.getElements()){
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
    for(int elem : customIntArr.getElements()){
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
  @Override
  public void firstSort(CustomIntArr customIntArr) throws CustomNullException{ // Bubble
    int[] array = customIntArr.getElements();
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
  public void secondSort(CustomIntArr customIntArr) throws CustomNullException{ // gnome
    int[] arr = customIntArr.getElements();
    int n = arr.length;
    int i = 1;
    while (i < arr.length) {
      if (i == 0 || arr[i - 1] <= arr[i]) i++;
      else {
        int tmp = arr[i];
        arr[i] = arr[i - 1];
        arr[i - 1] = tmp;
        i--;
      }
    }
    customIntArr.setElements(arr);
  }
  public void thirdSort(CustomIntArr customIntArr) throws CustomNullException{
    int[] arr = customIntArr.getElements();
    boolean swapped = true;
    int start = 0, end = arr.length - 1;
    while (swapped) {
      swapped = false;
      for (int i = start; i < end; i++) {
        if (arr[i] > arr[i + 1]) {
          int tmp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = tmp;
          swapped = true;
        }
      }
      if (!swapped) break;
      swapped = false;
      end--;
      for (int i = end - 1; i >= start; i--) {
        if (arr[i] > arr[i + 1]) {
          int tmp = arr[i]; arr[i] = arr[i + 1]; arr[i + 1] = tmp;
          swapped = true;
        }
      }
      start++;
    }
    customIntArr.setElements(arr);
  }
}
