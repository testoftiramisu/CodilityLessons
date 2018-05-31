package io.testoftiramisu.lesson03.timecomplexity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TapeEquilibriumTest {

  TapeEquilibrium tapeEquilibrium;

  @BeforeEach
  void setUp() {
    tapeEquilibrium = new TapeEquilibrium();
  }

  @Test
  @DisplayName("Example test")
  void solution() {
    int[] array = {3, 1, 2, 4, 3};
    assertThat(tapeEquilibrium.solution(array)).isEqualTo(1);
  }

  @Test
  @DisplayName("Small elements test")
  void smallElements() {
    int[] array = {-10, -20, -30, -40, 100};
    assertThat(tapeEquilibrium.solution(array)).isEqualTo(20);
  }

  @Test
  @DisplayName("Small elements test")
  void simplePositive() {
    int[] array = {5, 6, 2, 4, 1};
    assertThat(tapeEquilibrium.solution(array)).isEqualTo(4);
  }
}
