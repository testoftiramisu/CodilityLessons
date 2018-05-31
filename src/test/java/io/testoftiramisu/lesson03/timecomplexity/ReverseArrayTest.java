package io.testoftiramisu.lesson03.timecomplexity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseArrayTest {

  private ReverseArray reverseArray;

  @BeforeEach
  void setUp() {
    reverseArray = new ReverseArray();
  }

  @Test
  @DisplayName("Even array size.")
  void solution() {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] expectedResult = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    assertThat(reverseArray.solution(array)).isEqualTo(expectedResult);
  }

  @Test
  @DisplayName("Uneven array size.")
  void solution2() {
    int[] array = {1, 2, 3, 4, 5};
    int[] expectedResult = {5, 4, 3, 2, 1};
    assertThat(reverseArray.solution(array)).isEqualTo(expectedResult);
  }

  @Test
  @DisplayName("Single size.")
  void solution3() {
    int[] array = {1};
    int[] expectedResult = {1};
    assertThat(reverseArray.solution(array)).isEqualTo(expectedResult);
  }
}
