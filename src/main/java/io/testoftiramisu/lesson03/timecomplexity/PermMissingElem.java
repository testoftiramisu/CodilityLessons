package io.testoftiramisu.lesson03.timecomplexity;

public class PermMissingElem {

  public int solution(int[] array) {
    int length = array.length;
    double sum = (Math.pow(length, 2) + 3 * length + 2) / 2;

    for (int element : array) {
      sum -= element;
    }

    return (int) sum;
  }
}
