package com.korzh.ft.exception;

import com.korzh.ft.entity.CustomIntArr;
import com.korzh.ft.factory.CustomIntArrFactory;
import com.korzh.ft.service.impl.CustomIntArrServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomExceptionTest {
  CustomIntArr arrToTest;
  CustomIntArrServiceImpl impl = new CustomIntArrServiceImpl();
  final String ARR_IS_NULL = "CustomIntArr is null";
  @BeforeEach
  void setUp() {
    arrToTest = null;
  }

  @AfterEach
  void tearDown() {
    arrToTest = null;
  }

  @Test
  void findMin() {
    Exception exception = assertThrows(CustomException.class, () -> {
      impl.findMin(arrToTest);
    });
    assertEquals(ARR_IS_NULL, exception.getMessage());
  }

  @Test
  void findMax() {
    Exception exception = assertThrows(CustomException.class, () -> {
      impl.findMax(arrToTest);
    });
    assertEquals(ARR_IS_NULL, exception.getMessage());
  }

  @Test
  void findAvg() {
    Exception exception = assertThrows(CustomException.class, () -> {
      impl.findAvg(arrToTest);
    });
    assertEquals(ARR_IS_NULL, exception.getMessage());
  }

  @Test
  void replaceByIndex() {
    Exception exception = assertThrows(CustomException.class, () -> {
      impl.replaceByIndex(arrToTest, 21, 2);
    });
    assertEquals(ARR_IS_NULL, exception.getMessage());
  }
  @Test
  void findSum() {
    Exception exception = assertThrows(CustomException.class, () -> {
      impl.findSum(arrToTest);
    });
    assertEquals(ARR_IS_NULL, exception.getMessage());
  }

  @Test
  void findPositiveCount() {
    Exception exception = assertThrows(CustomException.class, () -> {
      impl.findPositiveCount(arrToTest);
    });
    assertEquals(ARR_IS_NULL, exception.getMessage());
  }
  @Test
  void findNegativeCount() {
    Exception exception = assertThrows(CustomException.class, () -> {
      impl.findPositiveCount(arrToTest);
    });
    assertEquals(ARR_IS_NULL, exception.getMessage());
  }
}