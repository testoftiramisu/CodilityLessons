package io.testoftiramisu.lesson04.countingelements;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PermCheckTest {

  private PermCheck permCheck;

  @BeforeEach
  void setUp() {
    permCheck = new PermCheck();
  }

  @Test
  @DisplayName("Simple array, should return one.")
  void solutionReturnsOne() {
    int[] array = {4, 1, 3, 2};
    assertThat(permCheck.solution(array)).isEqualTo(1);
  }

  @Test
  @DisplayName("Simple array, should return zero.")
  void solutionReturnsZero() {
    int[] array = {4, 1, 3};
    assertThat(permCheck.solution(array)).isEqualTo(0);
  }

  @Test
  @DisplayName("Single element array, should return zero.")
  void singleElement() {
    int[] array = {2};
    assertThat(permCheck.solution(array)).isEqualTo(0);
  }

  @Test
  @DisplayName("Simple pair array, should return one.")
  void pair() {
    int[] array = {2, 1};
    assertThat(permCheck.solution(array)).isEqualTo(1);
  }
}
