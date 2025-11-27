package com.korzh.ft.warehouse;

import com.korzh.ft.stats.CustomStats;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomWarehouseTest {
  CustomWarehouse warehouse;
  CustomStats stats;
  @BeforeEach
  void setUp() {
    warehouse = CustomWarehouse.getInstance();
    stats = new CustomStats(-1, 2,2,2);
  }

  @AfterEach
  void tearDown() {
    warehouse = null;
  }

  @Test
  void putStats() {
    warehouse.putStats( 2, stats);
    assertEquals(stats, warehouse.getStats(2));
  }

  @Test
  void getStats() {
    warehouse.putStats(2, stats);
    assertEquals(stats, warehouse.getStats((long)2));
  }

  @Test
  void removeStats() {
    warehouse.removeStats(2);
    assertEquals(null, warehouse.getStats(2));
  }
}