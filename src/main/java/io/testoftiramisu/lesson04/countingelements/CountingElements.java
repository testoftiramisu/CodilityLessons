package io.testoftiramisu.lesson04.countingelements;

public class CountingElements {

  int[] counting(int[] array, int max) {
    int[] count = new int[max + 1];

    for (int anArray : array) {
      count[anArray] += 1;
    }

    return count;
  }
}
