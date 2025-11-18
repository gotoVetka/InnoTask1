package com.korzh.ft.observer.impl;

import com.korzh.ft.entity.CustomIntArr;
import com.korzh.ft.exception.CustomException;
import com.korzh.ft.observer.CustomObserver;
import com.korzh.ft.service.CustomIntArrService;
import com.korzh.ft.service.impl.CustomIntArrServiceImpl;
import com.korzh.ft.stats.CustomStats;
import com.korzh.ft.warehouse.CustomWarehouse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomObserverImpl implements CustomObserver {
  public static final Logger logger = LogManager.getLogger();
  @Override
  public void update(CustomIntArr customIntArr) {
    CustomWarehouse wareHouse = CustomWarehouse.getInstance();
    CustomIntArrService service = new CustomIntArrServiceImpl();
    try {
      CustomStats arrayStats = new CustomStats(
              service.findMin(customIntArr),
              service.findMax(customIntArr),
              service.findAvg(customIntArr),
              service.findSum(customIntArr)
      );
      logger.info("update parameters for CustomArray id: {} in warehouse", customIntArr.getId());
      wareHouse.putStats(customIntArr.getId(), arrayStats);
    } catch (CustomException exeception) {
      logger.error("Error for CustomArray id {}: {}",
              customIntArr.getId(), exeception.getMessage());
    }
  }
}
