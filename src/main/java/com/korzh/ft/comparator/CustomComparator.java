package com.korzh.ft.comparator;

import com.korzh.ft.entity.CustomIntArr;
import com.korzh.ft.exception.CustomException;
import com.korzh.ft.service.CustomIntArrService;
import com.korzh.ft.service.impl.CustomIntArrServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Comparator;

public enum CustomComparator implements Comparator<CustomIntArr> {

  BY_ID {
    @Override
    public int compare(CustomIntArr array1, CustomIntArr array2) {
      return Long.compare(array1.getId(), array2.getId());
    }
  },
  BY_SUM {
    @Override
    public int compare(CustomIntArr array1, CustomIntArr array2) {
      int result;
      try {
        CustomIntArrService service = new CustomIntArrServiceImpl();
        result = Integer.compare(
                service.findSum(array1),
                service.findSum(array2)
        );
      } catch (CustomException exception) {
        logger.error("Shit Happened" + exception);
        result = 0;
      }
      return result;
    }
  },
  BY_LENGTH {
    @Override
    public int compare(CustomIntArr array1, CustomIntArr array2) {
      return Integer.compare(array1.getElements().length, array2.getElements().length);
    }
  };
  private static final Logger logger = LogManager.getLogger();
}
