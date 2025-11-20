package com.korzh.ft.comparator;

import com.korzh.ft.entity.CustomIntArr;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CustomComparatorTest {
  ArrayList<CustomIntArr> arrayList;
  @BeforeEach
  void setUp() {
    arrayList = new ArrayList<>();
    arrayList.add(new CustomIntArr().
            builder().
            elements(new int[]{1,2,3}).
            id(1).
            build());
    arrayList.add(new CustomIntArr().
            builder().
            elements(new int[]{112,23,344,65}).
            id(2).
            build());
    arrayList.add(new CustomIntArr().
            builder().
            elements(new int[]{12,23,44}).
            id(3).
            build());
  }

  @AfterEach
  void tearDown() {
    arrayList = null;
  }

  @Test
  void testCompareBySum(){
    arrayList.sort(CustomComparator.BY_SUM);
    assertAll(
            () -> assertArrayEquals(new int[]{1,2,3}, arrayList.get(0).getElements()),
            () -> assertArrayEquals(new int[]{12,23,44}, arrayList.get(1).getElements()),
            () -> assertArrayEquals(new int[]{112,23,344,65}, arrayList.get(2).getElements())
    );
  }

  @Test
  void testCompareByLength(){
    arrayList.sort(CustomComparator.BY_LENGTH);
    assertAll(
            () -> assertArrayEquals(new int[]{1,2,3}, arrayList.get(0).getElements()),
            () -> assertArrayEquals(new int[]{12,23,44}, arrayList.get(1).getElements()),
            () -> assertArrayEquals(new int[]{112,23,344,65}, arrayList.get(2).getElements())
    );
  }

  @Test
  void testCompareById(){
    arrayList.sort(CustomComparator.BY_ID);
    assertAll(
            () -> assertArrayEquals(new int[]{1,2,3}, arrayList.get(0).getElements()),
            () -> assertArrayEquals(new int[]{112,23,344,65}, arrayList.get(1).getElements()),
            () -> assertArrayEquals(new int[]{12,23,44}, arrayList.get(2).getElements())
    );
  }
}