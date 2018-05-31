package io.testoftiramisu.lesson03.timecomplexity;

public class ReverseArray {

  int[] solution(int[] array) {

    for (int i = 0; i < array.length / 2; i++) {
      int k = array.length - i - 1;
      int tmp = array[i];
      array[i] = array[k];
      array[k] = tmp;
    }

    return array;
  }
}
