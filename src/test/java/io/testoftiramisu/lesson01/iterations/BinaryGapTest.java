package io.testoftiramisu.lesson01.iterations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryGapTest {
  private BinaryGap binaryGap;

  @BeforeEach
  void setUp() {
    binaryGap = new BinaryGap();
  }

  @Test
  @DisplayName("Binary gap in fifteen is zero.")
  void checkLongestBinaryGapInFifteen() {
    assertThat(binaryGap.getLongestBinaryGap(15)).isEqualTo(0);
  }

  @Test
  @DisplayName("Binary gap in thirty two is zero.")
  void checkLongestBinaryGapInThirtyTwo() {
    assertThat(binaryGap.getLongestBinaryGap(32)).isEqualTo(0);
  }

  @Test
  @DisplayName("Binary gap in one thousand forty one is five.")
  void checkLongestBinaryGapInOneThousandFortyOne() {
    assertThat(binaryGap.getLongestBinaryGap(1041)).isEqualTo(5);
  }
}
