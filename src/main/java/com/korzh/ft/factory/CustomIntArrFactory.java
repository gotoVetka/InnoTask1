package com.korzh.ft.factory;

import com.korzh.ft.entity.CustomIntArr;

public class CustomIntArrFactory {

  private CustomIntArrFactory() {}

  public CustomIntArr create(int[] elements, long id) {
    return new CustomIntArr().builder().elements(elements.clone()).id(id).build();
  }
  public CustomIntArr empty() {
    return new CustomIntArr().builder().elements(null).id(0).build();
  }
}
