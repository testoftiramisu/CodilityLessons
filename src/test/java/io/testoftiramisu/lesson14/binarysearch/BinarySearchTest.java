package io.testoftiramisu.lesson14.binarysearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class BinarySearchTest {
  private BinarySearch binarySearch;

  @BeforeEach
  void setUp() {
    binarySearch = new BinarySearch();
  }

  @Test
  @DisplayName("Number is on the middle of array.")
  void findNumberPositionInTheMiddle() {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    assertThat(binarySearch.findNumberPosition(array, 6)).isEqualTo(5);
  }

  @Test
  @DisplayName("Number is on the end of the array.")
  void findNumberPositionInTheEnd() {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    assertThat(binarySearch.findNumberPosition(array, 12)).isEqualTo(11);
  }

  @Test
  @DisplayName("Number is on the beginning of the array.")
  void findNumberPositionInTheBeginning() {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    assertThat(binarySearch.findNumberPosition(array, 12)).isEqualTo(11);
  }
}
