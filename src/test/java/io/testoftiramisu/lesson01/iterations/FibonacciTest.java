package io.testoftiramisu.lesson01.iterations;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FibonacciTest {

  Fibonacci fibonacci = new Fibonacci();

  @Test
  void toStringTest() {
    assertThat(fibonacci.toString(13)).isEqualTo("0 1 1 2 3 5 8 13");
  }
}
