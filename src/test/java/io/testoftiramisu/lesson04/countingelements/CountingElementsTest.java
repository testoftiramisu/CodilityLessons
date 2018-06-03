package io.testoftiramisu.lesson04.countingelements;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CountingElementsTest {

  private CountingElements countingElements;

  @BeforeEach
  void setUp() {
    countingElements = new CountingElements();
  }

  @Test
  void counting() {
    int[] array = {1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3};
    int[] expected = {0, 4, 6, 2};
    assertThat(countingElements.counting(array, 3)).isEqualTo(expected);
  }
}
