package io.testoftiramisu.lesson100.training;

/**
 * Count occurrences of a digit.
 */
public class CountOccurrences {

  /**
   * Returns occurrences of digit "1" in all positive numbers no exceeding provided value.
   */
  public int solution(int number) {

    int result = 1;

    for (int i = 10; i <= number; i++) {
      char[] array = String.valueOf(i).toCharArray();

      for (char ch : array) {
        if (ch == '1') {
          result++;
        }
      }
    }
    return result;
  }
}
