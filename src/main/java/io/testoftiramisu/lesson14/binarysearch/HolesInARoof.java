package io.testoftiramisu.lesson14.binarysearch;

import java.util.Arrays;

/**
 * Helps to choose the minimal size of the boards that allows all the holes in the roof to be
 * covered by boards.
 */
public class HolesInARoof {

  /**
   * Returns minimal size of the board that allows to cover all the holes in a roof.
   *
   * @param array of binary values ∈ {0, 1}, represents holes in a roof (1 is a hole)
   * @param boards number of given boards of the same size
   */
  int binarySearch(int[] array, final int boards) {
    int length = array.length;
    int start = 1;
    int end = length;
    int result = -1;

    while (start <= end) {
      int middle = start + end >> 1;
      if (checkBoards(array, middle) <= boards) {
        end = middle - 1;
        result = middle;
      } else {
        start = middle + 1;
      }
    }
    return result;
  }

  /**
   * Check whether size of the boards is sufficient for covering all holes.
   *
   * <p>Goes through all the indices from the left to the right and greedily count the boards.
   *
   * <p>Adds a new board only if there is a hole that is not covered by the last board.
   */
  private int checkBoards(int[] array, int size) {
    int length = array.length;
    int boards = 0;
    int last = -1;

    for (int i = 0; i < length; i++) {

      if (array[i] == 1 && last < i) {
        boards += 1;
        last = i + size - 1;
      }
    }
    return boards;
  }
}
