package io.testoftiramisu.lesson04.countingelements;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FrogRiverOneTest {

  private FrogRiverOne frogRiverOne;

  @BeforeEach
  void setUp() {
    frogRiverOne = new FrogRiverOne();
  }

  @Test
  void solution() {
    int[] array = {1, 3, 1, 4, 2, 3, 5, 4};

    assertThat(frogRiverOne.solution(5, array)).isEqualTo(6);


  }
}