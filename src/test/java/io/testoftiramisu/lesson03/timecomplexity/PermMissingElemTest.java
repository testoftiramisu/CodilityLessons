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
  void simple() {
    int[] array = {2, 4, 1, 5};
    assertThat(permMissingElem.solution(array)).isEqualTo(3);
  }

  @Test
  void missingFirst() {
    int[] array = {2, 3, 4, 5, 6};
    assertThat(permMissingElem.solution(array)).isEqualTo(1);
  }

  @Test
  void solution() {
    int[] array = {1, 2, 3, 5, 4, 7, 8, 9};
    assertThat(permMissingElem.solution(array)).isEqualTo(6);
  }

  @Test
  void empty() {
    int[] array = new int[0];
    assertThat(permMissingElem.solution(array)).isEqualTo(1);
  }

  @Test
  void single() {
    int[] array = {1};
    assertThat(permMissingElem.solution(array)).isEqualTo(2);
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
