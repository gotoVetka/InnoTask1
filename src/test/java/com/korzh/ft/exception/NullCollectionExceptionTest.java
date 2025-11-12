package com.korzh.ft.exception;

import com.korzh.ft.entity.CustomIntArr;
import com.korzh.ft.factory.CustomIntArrFactory;
import com.korzh.ft.service.impl.CustomIntArrServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NullCollectionExceptionTest {
  CustomIntArr arrToTest;
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
    Exception exception = assertThrows(NullCollectionException.class, () -> {
      impl.findMin(arrToTest);
    });
    assertEquals("Collection is null", exception.getMessage());
  }

  @Test
  void findMax() {
    Exception exception = assertThrows(NullCollectionException.class, () -> {
      impl.findMax(arrToTest);
    });
    assertEquals("Collection is null", exception.getMessage());
  }

  @Test
  void findAvg() {
    Exception exception = assertThrows(NullCollectionException.class, () -> {
      impl.findAvg(arrToTest);
    });
    assertEquals("Collection is null", exception.getMessage());
  }

  @Test
  void findSum() {
    Exception exception = assertThrows(NullCollectionException.class, () -> {
      impl.findSum(arrToTest);
    });
    assertEquals("Collection is null", exception.getMessage());
  }

  @Test
  void findPositiveCount() {
    Exception exception = assertThrows(NullCollectionException.class, () -> {
      impl.findPositiveCount(arrToTest);
    });
    assertEquals("Collection is null", exception.getMessage());
  }
  void findNegativeCount() {
    Exception exception = assertThrows(NullCollectionException.class, () -> {
      impl.findPositiveCount(arrToTest);
    });
    assertEquals("Collection is null", exception.getMessage());
  }
}