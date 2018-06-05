package io.testoftiramisu.lesson100.training;

/**
 * Represent the LinkedList based on array of ints.
 *
 * <p>The first node (the head) of a LinkedList is located on position [0].
 *
 * <p>The last node of LinkedList is equal to -1.
 */
public class LinkedList {

  /** Returns length of LinkedList provided as array of ints. */
  public int length(int[] array) {
    if (array.length == 0) {
      return 0;
    }

    int result = 0;
    int element = 0;

    while (element != -1) {
      result++;
      element = array[element];
    }

    return result;
  }
}
