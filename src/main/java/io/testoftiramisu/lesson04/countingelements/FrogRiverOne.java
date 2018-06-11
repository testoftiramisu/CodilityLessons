package io.testoftiramisu.lesson04.countingelements;

public class FrogRiverOne {

  /**
   * Returns the earliest time when a frog would be able to jump to the other side of a river.
   *
   * @param length represent the length of the river in jumps
   * @param array indexes represent how much seconds have passed, each value represent part of the
   *     river filled with leaf.
   */
  public int solution(int length, int[] array) {

    int[] river = new int[length];

    // Fill the "river" array with negative values
    for (int i = 0; i < length; i++) {
      river[i] = -1;
    }

    int jump = 0;
    for (int i = 0; i < array.length; i++) {

      if (river[array[i] - 1] == -1) {
        river[array[i] - 1] = i;

        // count every successful jump of the frog
        jump++;

        // if amount of jumps is equal to the length of the river, earliest time founded.
        if (jump == length) {
          return i;
        }
      }
    }

    return -1;
  }
}
