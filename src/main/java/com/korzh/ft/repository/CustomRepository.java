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

  private final List<CustomIntArr> array = new ArrayList<>();

  private CustomRepository() {}

  public static CustomRepository getInstance() {
    if(instance == null) {
      logger.info("Created new instance of repository");
      instance = new CustomRepository();
    }
    logger.info("Returned instance of repository");
    return instance;
  }

  public void add(CustomIntArr customIntArr) throws CustomException {
    if (customIntArr == null) {
      throw new CustomException("Bad entity to adding");
    }
    logger.info("Added custom array {} in repo",customIntArr);
    customIntArr.notifyObservers();
    array.add(customIntArr);

  }

  public void remove(CustomIntArr customIntArray) throws CustomException {
    if (customIntArray == null) {
      throw new CustomException("Bad entity to removing");
    }
    logger.info("Removed custom array {} from repository",customIntArray);
    CustomWarehouse.getInstance().removeStats(customIntArray.getId());
    array.remove(customIntArray);

  }

  public List<CustomIntArr> sort(Comparator<? super CustomIntArr> comparator) {
    logger.info("Called a sorting");
    var sorted = new ArrayList<>(array);
    sorted.sort(comparator);
    return sorted;
  }

  public List<CustomIntArr> query(CustomSpecification specification) {
    logger.info("Query with specification: {}", specification != null ? specification : "null");
    return array.stream().filter(specification::specify).toList();
  }


}
