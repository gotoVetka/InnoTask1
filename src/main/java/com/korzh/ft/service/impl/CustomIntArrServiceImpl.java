package com.korzh.ft.service.impl;

import com.korzh.ft.exception.NullCollectionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.korzh.ft.entity.CustomIntArr;
import com.korzh.ft.service.CustomIntArrService;

import java.util.Arrays;

public class CustomIntArrServiceImpl implements CustomIntArrService{
  private final Logger logger = LoggerFactory.getLogger(CustomIntArrServiceImpl.class);


  @Override
  public int findMax(CustomIntArr customIntArr) throws NullCollectionException {
    if (customIntArr.getElements() == null || Arrays.equals(customIntArr.getElements(), new int[0])) {
      throw new NullCollectionException("Collection is null");
    }
    int max = 0;
    int[] tmpArr = customIntArr.getElements();
    for(int elem : tmpArr){
      if(elem>max)max = elem;
    }
    return max;
  }

  @Override
  public int findMin(CustomIntArr customIntArr) throws NullCollectionException{
    if (customIntArr.getElements() == null || Arrays.equals(customIntArr.getElements(), new int[0])) {
      throw new NullCollectionException("Collection is null");
    }
    int[] tmpArr = customIntArr.getElements();
    int min = 0;
    for(int elem : tmpArr){
      if(elem<min)min = elem;
    }
    return min;
  }

  @Override
  public int findSum(CustomIntArr customIntArr) throws NullCollectionException{
    if (customIntArr.getElements() == null || Arrays.equals(customIntArr.getElements(), new int[0])) {
      throw new NullCollectionException("Collection is null");
    }
    int result = 0;
    int[] tmpArr = customIntArr.getElements();
    for(int elem : tmpArr){
      result += elem;
    }
    return result;
  }

  @Override
  public float findAvg(CustomIntArr customIntArr) throws NullCollectionException{
    if (customIntArr.getElements() == null || Arrays.equals(customIntArr.getElements(), new int[0])) {
      throw new NullCollectionException("Collection is null");
    }
    float result = 0;
    int[] tmpArr = customIntArr.getElements();
    for (int elem : tmpArr) {
      result += elem;
    }
    return result / tmpArr.length;
  }

  @Override
  public int findPositiveCount(CustomIntArr customIntArr) throws NullCollectionException{
    if (customIntArr.getElements() == null || Arrays.equals(customIntArr.getElements(), new int[0])) {
      throw new NullCollectionException("Collection is null");
    }
    int result = 0;
    for(int elem : customIntArr.getElements()){
      if(elem > 0)result++;
    }
    return result;
  }

  @Override
  public int findNegativeCount(CustomIntArr customIntArr) throws NullCollectionException{
    if (customIntArr.getElements() == null || Arrays.equals(customIntArr.getElements(), new int[0])) {
      throw new NullCollectionException("Collection is null");
    }
    int result = 0;
    for(int elem : customIntArr.getElements()){
      if(elem < 0)result++;
    }
    return result;
  }

  @Override
  public void replaceByIndex(CustomIntArr customIntArr, int index, int value) throws NullCollectionException{
    if (customIntArr.getElements() == null || Arrays.equals(customIntArr.getElements(), new int[0])) {
      throw new NullCollectionException("Collection is null");
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
