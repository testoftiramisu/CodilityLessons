package io.testoftiramisu.lesson04.countingelements;

/** Fast length: complexity is O(N + M). */
public class MaxCountersFast {

  public int[] solution(int counters, int[] array) {

    int base = 0;
    int max = 0;
    int[] result;

    result = new int[counters];

    for (int counter : array) {
      if (counter < counters + 1) {
        if (result[counter - 1] < base) {
          result[counter - 1] = base + 1;
        } else {
          result[counter - 1] += 1;
        }
        if (result[counter - 1] > max) {
          max = result[counter - 1];
        }
      } else {
        base = max;
      }
    }

    // Updates values for counters missed in previous loop
    for (int i = 0; i < result.length; i++) {
      if (result[i] < base) {
        result[i] = base;
      }
    }

    return result;
  }
}
