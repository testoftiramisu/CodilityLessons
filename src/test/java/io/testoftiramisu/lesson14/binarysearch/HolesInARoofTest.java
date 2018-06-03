package io.testoftiramisu.lesson14.binarysearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HolesInARoofTest {

  private HolesInARoof holesInARoof;

  @BeforeEach
  void setUp() {
    holesInARoof = new HolesInARoof();
  }

  @Test
  @DisplayName("Single board to cover both holes.")
  void binarySearchSingle() {
    int[] array = {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0};
    int boards = 1;
    assertThat(holesInARoof.binarySearch(array, boards)).isEqualTo(5);
  }

  @Test
  @DisplayName("Two boards to cover three holes each.")
  void binarySearchDouble() {
    int[] array = {0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1};
    int boards = 2;
    assertThat(holesInARoof.binarySearch(array, boards)).isEqualTo(4);
  }
}
