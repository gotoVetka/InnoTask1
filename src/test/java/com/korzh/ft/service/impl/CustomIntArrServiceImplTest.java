package com.korzh.ft.service.impl;

import com.korzh.ft.entity.CustomIntArr;
import com.korzh.ft.exception.CustomNullException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CustomIntArrServiceImplTest {
  CustomIntArr arrToTest = new CustomIntArr(new int[]{1,2,3}, 2);
  CustomIntArrServiceImpl impl = new CustomIntArrServiceImpl();

  @BeforeEach
  void setUp() {
  }

  @AfterEach
  void tearDown() {
    arrToTest = null;
  }

  @Test
  void findMax() throws CustomNullException {
    int expected = 3;
    int actual = impl.findMax(arrToTest);
    assertEquals(expected, actual);
  }

  @Test
  void findMin() throws CustomNullException {
    int expected = 1;
    int actual = impl.findMin(arrToTest);
    assertEquals(expected, actual);
  }

  @Test
  void findSum() throws CustomNullException {
    assertEquals(6, impl.findSum(arrToTest));
  }

  @Test
  void findAvg() throws CustomNullException {
    float expected = (float)2;
    float actual = impl.findAvg(arrToTest);
    assertEquals(expected, actual);
  }

  @Test
  void findPositiveCount() throws CustomNullException {
    assertEquals(3, impl.findPositiveCount(arrToTest));
  }

  @Test
  void findNegativeCount() throws CustomNullException {
    assertEquals(0, impl.findNegativeCount(arrToTest));
  }

  @Test
  void replaceByIndex() throws CustomNullException {
    int[] expected = {2, 2, 3};
    impl.replaceByIndex(arrToTest, 0, 2);
    assert(Arrays.equals(expected, arrToTest.getElements()));
  }
}