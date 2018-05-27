package io.testoftiramisu.lesson02.arrays;

import java.util.ArrayDeque;
import java.util.Deque;

public class CyclicRotation {

  /**
   * Returns array of integers rotated by given times.
   *
   * <p>Rotation means that each element of array will be shifted to the right K times.
   */
  public int[] solution(int[] array, int rotations) {
    int length = array.length;

    // Let's evaluate the input.
    if (length == 0) {
      return array;
    }

    int[] result = new int[length];
    int step = rotations % length;

    int offset = 0;
    for (int i = 0; i < length; i++) {
      int newPosition = i + step;
      if (newPosition > length - 1) {
        newPosition = offset++;
      }
      result[newPosition] = array[i];
    }
    return result;
  }

  /**
   * Returns array of integers rotated by given times.
   *
   * <p>Rotation means that each element of array will be shifted to the right K times.
   *
   * <p>Solution uses Deque for emulation of two directional query.
   */
  public int[] solutionDeque(int[] array, int rotations) {
    Deque<Integer> deque = new ArrayDeque<>();
    int length = array.length;

    // Let's evaluate the input.
    if (length == 0) {
      return array;
    }

    for (int element : array) {
      deque.offerLast(element);
    }

    for (int i = 0; i < rotations; i++) {
      Integer tmp = deque.pollLast();
      deque.offerFirst(tmp);
    }

    int result[] = new int[length];

    for (int i = 0; i < length; i++) {
      result[i] = deque.pollFirst();
    }

    return result;
  }
}
