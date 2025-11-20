package com.korzh.ft.repository;

import com.korzh.ft.entity.CustomIntArr;
import com.korzh.ft.exception.CustomException;
import com.korzh.ft.specification.CustomSpecification;
import com.korzh.ft.warehouse.CustomWarehouse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomRepository {
  public static final Logger logger = LogManager.getLogger();
  private static CustomRepository instance;

  private final List<CustomIntArr> arrays = new ArrayList<>();

  private CustomRepository() {}

  public static CustomRepository getInstance() {
    if(instance == null) {
      logger.info("create new instance of repository");
      instance = new CustomRepository();
    }
    logger.info("return instance of repository");
    return instance;
  }

  public void add(CustomIntArr customIntArr) throws CustomException {
    if (customIntArr == null) {
      throw new CustomException("Bad entity to add");
    }

    logger.info("add custom array {} in repo",customIntArr);
    customIntArr.notifyObservers();
    arrays.add(customIntArr);

  }

  public void remove(CustomIntArr customIntArray) throws CustomException {
    if (customIntArray == null) {
      throw new CustomException("Bad entity to delete");
    }
    logger.info("remove custom array {} from repo",customIntArray);
    CustomWarehouse.getInstance().removeStats(customIntArray.getId());
    arrays.remove(customIntArray);

  }

  public List<CustomIntArr> sort(Comparator<? super CustomIntArr> comparator) {
    logger.info("Called a method for sorting arrays");
    var sorted = new ArrayList<>(arrays);
    sorted.sort(comparator);
    return sorted;
  }

  public List<CustomIntArr> query(CustomSpecification specification) {
    logger.info("Starting query operation with specification: {}",
            specification != null ? specification.getClass().getSimpleName() : "null");
    return arrays.stream().filter(specification::specify).toList();
  }


}
