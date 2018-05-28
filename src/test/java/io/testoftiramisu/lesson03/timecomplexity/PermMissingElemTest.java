package io.testoftiramisu.lesson03.timecomplexity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PermMissingElemTest {
  private PermMissingElem permMissingElem;

  @BeforeEach
  void setUp() {
    permMissingElem = new PermMissingElem();
  }

  @Test
  void solution() {
    int[] array = {1, 2, 3, 5, 6, 7, 8, 9};
    assertThat(permMissingElem.solution(array)).isEqualTo(4);
  }

  @Test
  void empty() {
    int[] array = new int[0];
    assertThat(permMissingElem.solution(array)).isEqualTo(1);
  }

  @Test
  void single() {
    int[] array = {2};
    assertThat(permMissingElem.solution(array)).isEqualTo(1);
  }

  @Test
  void hugeArray() {
    int[] array = new int[9998];

    for (int i = 1; i <= array.length; i++) {
      array[i - 1] = i;
    }

    assertThat(permMissingElem.solution(array)).isEqualTo(9999);
  }
}
