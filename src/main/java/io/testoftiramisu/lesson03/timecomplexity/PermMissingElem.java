package io.testoftiramisu.lesson03.timecomplexity;

/** Search for a missing element from the given array. */
public class PermMissingElem {

  /**
   * Returns a missing element from the given array.
   *
   * <p>for int[9998]{1..9998} element 9999 is missing.
   *
   * <p>for int[8]{1, 2, 3, 5, 6, 7, 8, 9} element 4 is missing.
   *
   * @param array with elements in range {1...array.length + 1};
   */
  public int solution(int[] array) {
    int length = array.length;
    double sum = (Math.pow(length, 2) + 3 * length + 2) / 2;

    for (int element : array) {
      sum -= element;
    }

    return (int) sum;
  }
}
