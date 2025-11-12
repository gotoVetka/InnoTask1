package com.korzh.ft.exception;

import com.korzh.ft.entity.CustomIntArr;
import com.korzh.ft.factory.CustomIntArrFactory;
import com.korzh.ft.service.impl.CustomIntArrServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomNullExceptionTest {
  CustomIntArr arrToTest;
  private final String ARR_IS_NULL = "Arr is null";
  CustomIntArrServiceImpl impl = new CustomIntArrServiceImpl();

  @BeforeEach
  void setUp() {
    arrToTest = CustomIntArrFactory.empty();
  }

  @AfterEach
  void tearDown() {
    arrToTest = null;
  }

  @Test
  void findMin() {
    Exception exception = assertThrows(CustomNullException.class, () -> {
      impl.findMin(arrToTest);
    });
    assertEquals(ARR_IS_NULL, exception.getMessage());
  }

  @Test
  void findMax() {
    Exception exception = assertThrows(CustomNullException.class, () -> {
      impl.findMax(arrToTest);
    });
    assertEquals(ARR_IS_NULL, exception.getMessage());
  }

  @Test
  void findAvg() {
    Exception exception = assertThrows(CustomNullException.class, () -> {
      impl.findAvg(arrToTest);
    });
    assertEquals(ARR_IS_NULL, exception.getMessage());
  }

  @Test
  void replaceByIndex() {
    Exception exception = assertThrows(CustomNullException.class, () -> {
      impl.replaceByIndex(arrToTest, 21, 2);
    });
    assertEquals(ARR_IS_NULL, exception.getMessage());
  }
  @Test
  void findSum() {
    Exception exception = assertThrows(CustomNullException.class, () -> {
      impl.findSum(arrToTest);
    });
    assertEquals(ARR_IS_NULL, exception.getMessage());
  }

  @Test
  void findPositiveCount() {
    Exception exception = assertThrows(CustomNullException.class, () -> {
      impl.findPositiveCount(arrToTest);
    });
    assertEquals(ARR_IS_NULL, exception.getMessage());
  }
  @Test
  void findNegativeCount() {
    Exception exception = assertThrows(CustomNullException.class, () -> {
      impl.findPositiveCount(arrToTest);
    });
    assertEquals(ARR_IS_NULL, exception.getMessage());
  }
}