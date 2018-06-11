package io.testoftiramisu.lesson100.training;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CountOccurrencesTest {

  private CountOccurrences countOccurrences;

  @BeforeEach
  void setUp() {
    countOccurrences = new CountOccurrences();
  }

  @Test
  @DisplayName("There should be six occurrences of One in all digits no exceeding Thirteen.")
  void testThirteen() {
    assertThat(countOccurrences.solution(13)).isEqualTo(6);
  }

  @Test
  @DisplayName("There should be two occurrences of One in all digits no exceeding Ten.")
  void testTen() {
    assertThat(countOccurrences.solution(10)).isEqualTo(2);
  }
}
