package com.korzh.ft.warehouse;

import com.korzh.ft.stats.CustomStats;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class CustomWarehouse {
  public static final Logger logger = LogManager.getLogger();
  private final Map<Long, CustomStats> statsMap = new HashMap<>();
  private static CustomWarehouse instance;

  private CustomWarehouse() {}

  public static CustomWarehouse getInstance() {
    if(instance == null){
      logger.info("create new instance of warehouse");
      instance = new CustomWarehouse();
    }
    logger.info("return instance of warehouse");
    return instance;
  }

  public void putStats(long id, CustomStats customArrayParameters) {
    if (customArrayParameters == null) {
      logger.warn("Put null stats for id: {}", id);
      return;
    }
    statsMap.put(id, customArrayParameters);
  }
  public CustomStats getStats(long id) {
    return statsMap.get(id);
  }

  public void removeStats(long id) {
    logger.info("Remove stats with id {} from warehouse", id);
    statsMap.remove(id);
  }
}
