package com.korzh.ft.service.impl;

import com.korzh.ft.entity.CustomIntArr;
import com.korzh.ft.exception.NullCollectionException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CustomIntArrServiceImplTest {
  CustomIntArr arrToTest = new CustomIntArr(new int[]{1,2,30}, 2);
  CustomIntArrServiceImpl impl = new CustomIntArrServiceImpl();

  @BeforeEach
  void setUp() {
  }

  @AfterEach
  void tearDown() {
    arrToTest = null;
  }

  @Test
  void findMax() throws NullCollectionException {
    int expected = 30;
    int actual = impl.findMax(arrToTest);
    assertEquals(expected, actual);
  }

  @Test
  void findMin() throws NullCollectionException {
    int expected = 1;
    int actual = impl.findMax(arrToTest);
    assertEquals(expected, actual);
  }

  @Test
  void findSum() throws NullCollectionException {
    assertEquals(6, impl.findSum(arrToTest));
  }

  @Test
  void findAvg() throws NullCollectionException {
    float expected = (float)1.5;
    float actual = impl.findAvg(arrToTest);
    assertEquals(expected, actual);
  }

  @Test
  void findPositiveCount() throws NullCollectionException {
    assertEquals(3, impl.findPositiveCount(arrToTest));
  }

  @Test
  void findNegativeCount() throws NullCollectionException {
    assertEquals(0, impl.findNegativeCount(arrToTest));
  }

  @Test
  void replaceByIndex() throws NullCollectionException {
    int[] expected = {};
    impl.replaceByIndex(arrToTest, 0, 2);
    Arrays.equals(expected, arrToTest.getElements());
  }
}