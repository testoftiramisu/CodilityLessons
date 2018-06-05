package io.testoftiramisu.lesson04.countingelements;

/** Slow length. Complexity is O(N * M). */
public class MaxCounters {

  private int[] result;

  public int[] solution(int counters, int[] array) {

    result = new int[counters];

    for (int element : array) {
      if (element == counters + 1) {
        maxCounters();
      } else {
        increase(element);
      }
    }

    return result;
  }

  private int getMaxElement(int[] array) {
    int max = 0;
    for (int element : result) {
      if (element > max) {
        max = element;
      }
    }
    return max;
  }

  private void maxCounters() {
    int max = getMaxElement(result);
    for (int i = 0; i < result.length; i++) {
      result[i] = max;
    }
  }

  private void increase(int x) {
    result[x - 1] += 1;
  }
}
