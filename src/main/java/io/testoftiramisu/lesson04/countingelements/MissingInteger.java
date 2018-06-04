package io.testoftiramisu.lesson04.countingelements;

public class MissingInteger {

  private static final int ONE_MILLION_AND_ONE = 1_000_001;

  public int solution(int[] array) {

    int[] indexes = new int[ONE_MILLION_AND_ONE];

    for (int element : array) {
      if (element >= 0) {
        indexes[element] = element;
      }
    }

    for (int i = 1; i < indexes.length; i++) {
      if (indexes[i] == 0) {
        return i;
      }
    }

    return array.length;
  }
}
