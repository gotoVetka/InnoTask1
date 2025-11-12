package com.korzh.ft.factory;

import com.korzh.ft.entity.CustomIntArr;

import java.util.Arrays;

public class CustomIntArrFactory {

  private CustomIntArrFactory() {}

  public static CustomIntArr create(int[] elements, long id) {
    return new CustomIntArr().builder().elements(Arrays.copyOf(elements, elements.length)).id(id).build();
  }
  public static CustomIntArr empty() {
    return new CustomIntArr().builder().elements(Arrays.copyOf(new int[0], 0)).id(0).build();
  }
}
