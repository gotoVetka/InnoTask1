package com.korzh.ft.service.impl;

import com.korzh.ft.entity.CustomIntArr;
import com.korzh.ft.exception.CustomException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CustomIntArrServiceImplTest {
  CustomIntArr arrToTest;
  CustomIntArrServiceImpl impl = new CustomIntArrServiceImpl();

  @BeforeEach
  void setUp() {
    arrToTest = new CustomIntArr.Builder().elements(new int[]{3,1,2}).id(123).build();
  }

  @AfterEach
  void tearDown() {
    arrToTest = null;
  }

  @Test
  void findMax() throws CustomException {
    int expected = 3;
    int actual = impl.findMax(arrToTest);
    assertEquals(expected, actual);
  }

  @Test
  void findMin() throws CustomException {
    int expected = 1;
    int actual = impl.findMin(arrToTest);
    assertEquals(expected, actual);
  }

  @Test
  void findSum() throws CustomException {
    assertEquals(6, impl.findSum(arrToTest));
  }

  @Test
  void findAvg() throws CustomException {
    float expected = 2;
    float actual = impl.findAvg(arrToTest);
    assertEquals(expected, actual);
  }

  @Test
  void findPositiveCount() throws CustomException {
    assertEquals(3, impl.findPositiveCount(arrToTest));
  }

  @Test
  void findNegativeCount() throws CustomException {
    assertEquals(0, impl.findNegativeCount(arrToTest));
  }

  @Test
  void replaceByIndex() throws CustomException {
    int[] expected = {2, 1, 2};
    impl.replaceByIndex(arrToTest, 0, 2);
    assert(Arrays.equals(expected, arrToTest.getElements()));
  }
  @Test
  void firstSort() throws CustomException{
    int[] expected = {1,2,3};
    impl.bubbleSort(arrToTest);
    assert(Arrays.equals(expected, arrToTest.getElements()));
  }
}