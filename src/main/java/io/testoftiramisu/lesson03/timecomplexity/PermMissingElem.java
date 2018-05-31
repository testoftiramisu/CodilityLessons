package io.testoftiramisu.lesson03.timecomplexity;

import java.util.Arrays;

public class PermMissingElem {

  /** Returns a missing element from the given array. */
  public int slowSolution(int[] array) {
    int length = array.length;
    double sum = (Math.pow(length, 2) + 3 * length + 2) / 2;

    for (int element : array) {
      sum -= element;
    }

    return (int) sum;
  }

  /** Returns a missing element from the given array. */
  public int quickSolution(int[] array) {
    if (array.length == 0) {
      return 1;
    } else if (array.length == 1) {
      return array[0] == 1 ? 2 : 1;
    }

    Arrays.sort(array);

    int pivot = array.length / 2;

    while (true) {
      if (array[pivot] - 1 == pivot) {
        pivot += pivot / 2;
        if (pivot > array.length) {
          pivot = array.length;
        }
      } else if (array[pivot] - 1 == pivot) {
        pivot -= pivot / 2;
      } else {
        return pivot;
      }
    }
  }
}
