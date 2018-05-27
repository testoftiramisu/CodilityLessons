package io.testoftiramisu.lesson01.iterations;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FibonacciTest {

  Fibonacci fibonacci = new Fibonacci();

  @Test
  @DisplayName("Sequence up to 13")
  void toStringTestSmall() {
    assertThat(fibonacci.toString(13)).isEqualTo("0 1 1 2 3 5 8 13");
  }

  @Test
  @DisplayName("Sequence up to 6765")
  void toStringTestLarge() {
    assertThat(fibonacci.toString(6765))
        .isEqualTo("0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765");
  }
}
