package io.testoftiramisu.lesson02.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OddOccurrencesInArrayTest {

  @Test
  void solution() {
    OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();
    int[] input = {9, 3, 9, 3, 9, 7, 9};
    assertThat(oddOccurrencesInArray.solution(input)).isEqualTo(7);
  }
}
