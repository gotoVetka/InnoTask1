package com.korzh.ft.repository;

import com.korzh.ft.comparator.CustomComparator;
import com.korzh.ft.entity.CustomIntArr;
import com.korzh.ft.exception.CustomException;
import com.korzh.ft.specification.CustomSpecification;
import com.korzh.ft.specification.impl.ContainsValueSpecification;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomRepositoryTest {
  CustomRepository repository;
  @BeforeEach
  void setUp() {
    repository = CustomRepository.getInstance();
  }

  @AfterEach
  void tearDown() {
    repository = null;
  }

  @Test
  void add() throws CustomException {
    CustomIntArr arrToTest = new CustomIntArr().builder().elements(new int[]{1, 2, 3}).id(123).build();
    repository.add(arrToTest);
    assertTrue(repository.sort(Comparator.comparingLong(CustomIntArr::getId)).contains(arrToTest));
    repository.remove(arrToTest);
  }

  @Test
  void remove() throws CustomException {
    CustomIntArr arrToTest = new CustomIntArr().builder().elements(new int[]{1, 2, 3}).id(123).build();
    repository.add(arrToTest);
    repository.remove(arrToTest);
    assertFalse(repository.sort(Comparator.comparingLong(CustomIntArr::getId)).contains(arrToTest));
  }

  @Test
  void sort() throws CustomException{
    CustomIntArr array1 = new CustomIntArr().builder().elements(new int[]{243, 342 ,4}).id(123).build();
    CustomIntArr array2 = new CustomIntArr().builder().elements(new int[]{1, 2, 3}).id(123).build();
    CustomIntArr array3 = new CustomIntArr().builder().elements(new int[]{3, 5, 6}).id(123).build();
    repository.add(array1);
    repository.add(array2);
    repository.add(array3);
    var sorted = repository.sort(CustomComparator.BY_SUM);
    assertAll(() -> assertEquals(sorted.get(0), array2),
              () -> assertEquals(sorted.get(1), array3),
              () -> assertEquals(sorted.get(2), array1));


    repository.remove(array1);
    repository.remove(array2);
    repository.remove(array3);
  }

  @Test
  void query() throws CustomException{
    CustomIntArr array1 = new CustomIntArr().builder().elements(new int[]{1, 2, 3}).id(123).build();
    CustomIntArr array2 = new CustomIntArr().builder().elements(new int[]{3, 5, 6}).id(123).build();
    repository.add(array1);
    repository.add(array2);

    CustomSpecification contains123 = new ContainsValueSpecification(3);
    List<CustomIntArr> result = repository.query(contains123);
    assertEquals(2, result.size());
    assertTrue(result.contains(array2));

    repository.remove(array1);
    repository.remove(array2);
  }
}