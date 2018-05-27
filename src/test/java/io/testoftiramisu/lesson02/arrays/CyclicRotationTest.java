package io.testoftiramisu.lesson02.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CyclicRotationTest {
  CyclicRotation cyclicRotation;

  @BeforeEach
  void setUp() {
    cyclicRotation = new CyclicRotation();
  }

  @Test
  @DisplayName("Rotate {0, 0, 0} one time.")
  void solution000() {
    int[] array = {0, 0, 0};
    int[] expectedResult = {0, 0, 0};
    assertThat(cyclicRotation.solution(array, 1)).containsSequence(expectedResult);
    assertThat(cyclicRotation.solutionDeque(array, 1)).containsSequence(expectedResult);
  }

  @Test
  @DisplayName("Rotate {3, 8, 9, 7, 6} three times.")
  void solution38976() {
    int[] array = {3, 8, 9, 7, 6};
    int[] expectedResult = {9, 7, 6, 3, 8};
    assertThat(cyclicRotation.solution(array, 3)).containsSequence(expectedResult);
    assertThat(cyclicRotation.solutionDeque(array, 3)).containsSequence(expectedResult);
  }

  @Test
  @DisplayName("Rotate {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} five times.")
  void solution12345678910() {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] expectedResult = {6, 7, 8, 9, 10, 1, 2, 3, 4, 5};
    assertThat(cyclicRotation.solution(array, 5)).containsSequence(expectedResult);
    assertThat(cyclicRotation.solutionDeque(array, 5)).containsSequence(expectedResult);
  }
}
