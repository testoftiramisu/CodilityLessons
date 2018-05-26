package io.testoftiramisu.lesson01.iterations;

public class Fibonacci {

  public String toString(int toNumber) {

    StringBuilder builder = new StringBuilder();

    int first = 0;
    int second = 1;
    int sum;
    builder.append(first).append(" ").append(second);

    while (second < toNumber) {
      sum = first + second;
      builder.append(" ").append(sum);
      first = second;
      second = sum;
    }
    return builder.toString();
  }
}
