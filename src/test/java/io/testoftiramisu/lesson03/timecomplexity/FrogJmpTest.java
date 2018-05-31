package io.testoftiramisu.lesson03.timecomplexity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FrogJmpTest {

  private FrogJmp frogJmp;

  @BeforeEach
  void setUp() {
    frogJmp = new FrogJmp();
  }

  @Test
  @DisplayName("Long jumps.")
  void solution() {
    assertThat(frogJmp.solution(10, 85, 30)).isEqualTo(3);
  }

  @Test
  @DisplayName("Small jumps.")
  void solution2() {
    assertThat(frogJmp.solution(1, 5, 2)).isEqualTo(2);
  }

  @Test
  @DisplayName("Big jump.")
  void solution3() {
    assertThat(frogJmp.solution(10, 20, 30)).isEqualTo(1);
  }

  @Test
  @DisplayName("No jumps needed. ")
  void solution4() {
    assertThat(frogJmp.solution(6, 6, 3)).isEqualTo(0);
  }
}
