package io.testoftiramisu.lesson03.timecomplexity;

public class TapeEquilibrium {

  /**
   * Returns the absolute difference between the sum of the first part and the sum of second part of
   * array.
   */
  public int solution(int[] array) {

    if (array.length == 2) {
      return Math.abs(array[0] - array[1]);
    }

    int leftSum = 0;
    int rightSum = 0;
    int min = 1000;
    int sum;

    for (int element : array) {
      rightSum += element;
    }

    for (int i = 0; i < array.length - 1; i++) {

      leftSum += array[i];
      rightSum -= array[i];

      sum = Math.abs(leftSum - rightSum);
      if (min > sum) {
        min = sum;
      }
    }

    return min;
  }
}
