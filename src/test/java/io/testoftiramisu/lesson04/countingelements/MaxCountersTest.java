package io.testoftiramisu.lesson04.countingelements;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxCountersTest {

  private MaxCounters maxCounters;

  @BeforeEach
  void setUp() {
    maxCounters = new MaxCounters();
  }

  @Test
  void solution() {
    int[] array = {3, 4, 4, 6, 1, 4, 4};
    int[] result = {3, 2, 2, 4, 2};
    assertThat(maxCounters.solution(5, array)).isEqualTo(result);
  }
}
