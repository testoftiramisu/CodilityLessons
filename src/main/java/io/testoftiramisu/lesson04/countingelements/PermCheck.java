package io.testoftiramisu.lesson04.countingelements;

/** A permutation is a sequence that contains each element from 1 to N once, and only once. */
public class PermCheck {

  int solution(int array[]) {
    int[] indexes = new int[array.length + 1];

    for (int element : array) {

      if (element > array.length) {
        return 0;
      }
      indexes[element] = 1;
    }

    for (int i = 1; i < indexes.length; i++) {
      if (indexes[i] == 0) {
        return 0;
      }
    }

    return 1;
  }
}
