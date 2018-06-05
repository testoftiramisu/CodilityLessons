package io.testoftiramisu.lesson100.training;

public class CountOccurrencesOfOne {

  public int solution(int number) {

    int result = 0;

    for (int i = 1; i <= number; i++) {
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
