package io.testoftiramisu.lesson14.binarysearch;

import java.util.Arrays;

public class BinarySearch {

  int findNumberPosition(int[] array, final int number) {
    int length = array.length;
    int start = 0;
    int end = length - 1;
    int result = -1;

    Arrays.sort(array);

    while (start <= end) {
      int middle = start + end >> 1;

      if (array[middle] <= number) {
        start = middle + 1;
        result = middle;
      } else {
        end = middle - 1;
      }
    }
    return result;
  }
}
