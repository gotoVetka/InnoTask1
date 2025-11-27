package com.korzh.ft.observer.impl;

import com.korzh.ft.entity.CustomIntArr;
import com.korzh.ft.exception.CustomException;
import com.korzh.ft.factory.CustomIntArrFactory;
import com.korzh.ft.stats.CustomStats;
import com.korzh.ft.warehouse.CustomWarehouse;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomObserverImplTest {

  private CustomObserverImpl observer;
  private CustomWarehouse wareHouse;

  @BeforeEach
  void setUp() {
    observer = new CustomObserverImpl();
    wareHouse = CustomWarehouse.getInstance();
  }

  @Test
  void testUpdate_AddsStatsToWarehouse() throws CustomException {
    CustomIntArr customArray = new CustomIntArr().builder().elements(new int[]{3,3,3}).id(12313).build();
    long id = customArray.getId();

    observer.update(customArray);

    CustomStats stats = wareHouse.getStats(id);
    assertAll(
            () -> assertNotNull(stats),
            () -> assertEquals(3, stats.min()),
            () -> assertEquals(3, stats.max()),
            () -> assertEquals(3, stats.avg()),
            () -> assertEquals(9, stats.sum())
    );
  }

  @Test
  void testUpdate_WithExceptionHandledGracefully() {
    CustomIntArr brokenArray = new CustomIntArr().builder().elements(null).id(123).build();
    assertThrows(NullPointerException.class, () -> observer.update(brokenArray));
  }
}