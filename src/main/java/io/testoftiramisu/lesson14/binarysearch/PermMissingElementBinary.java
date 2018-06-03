package io.testoftiramisu.lesson14.binarysearch;

import java.util.Arrays;

public class PermMissingElementBinary {

  /**
   * Returns a missing element from the given array.
   *
   * <p>for int[9998]{1..9998} element 9999 is missing.
   *
   * <p>for int[8]{1, 2, 3, 5, 6, 7, 8, 9} element 4 is missing.
   */
  int solution(int[] array) {
    int length = array.length;
    int start = 0;
    int end = length - 1;
    int result = -1;

    Arrays.sort(array);

    while (start <= end) {
      int middle = start + end >> 1;
      if (array[middle] <= middle + 1) {
        start = middle + 1;
        result = middle;
      } else {
        end = middle - 1;
      }
    }

    return result + 2;
  }
}
