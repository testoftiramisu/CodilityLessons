package io.testoftiramisu.lesson02.arrays;

import java.util.HashMap;
import java.util.Map;

/** Returns the value of the unpaired element from the given array. */
public class OddOccurrencesInArray {

  public int solution(int[] array) {

    Map<Integer, Integer> map = new HashMap<>();

    for (int element : array) {
      if (map.containsKey(element)) {
        map.put(element, map.get(element) + 1);
      } else {
        map.put(element, 1);
      }
    }

    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() % 2 != 0) {
        return entry.getKey();
      }
    }

    return 0;
  }
}
