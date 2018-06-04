package io.testoftiramisu.lesson04.countingelements;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MissingIntegerTest {

  MissingInteger missingInteger;

  @BeforeEach
  void setUp() {
    missingInteger = new MissingInteger();
  }

  @Test
  @DisplayName("Simple array with all positive numbers")
  void solution() {
    int[] array = {1, 2, 3};
    assertThat(missingInteger.solution(array)).isEqualTo(4);
  }

  @Test
  @DisplayName("Simple array with all negative numbers")
  void solutionNegative() {
    int[] array = {-1, -3};
    assertThat(missingInteger.solution(array)).isEqualTo(1);
  }

  @Test
  @DisplayName("Simple array with all negative numbers")
  void singleElement() {
    int[] array = {2};
    assertThat(missingInteger.solution(array)).isEqualTo(1);
  }
}
