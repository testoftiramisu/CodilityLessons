package io.testoftiramisu.lesson100.training;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LinkedListTest {

  private LinkedList linkedList;

  @BeforeEach
  void setUp() {
    linkedList = new LinkedList();
  }

  @Test
  void solution() {
    int[] array = {1, 4, -1, 3, 2};
    assertThat(linkedList.length(array)).isEqualTo(4);
  }

  @Test
  void solution2() {
    int[] array = {-1};
    assertThat(linkedList.length(array)).isEqualTo(1);
  }

  @Test
  void solution3() {
    int[] array = {};
    assertThat(linkedList.length(array)).isEqualTo(0);
  }
}
