package io.testoftiramisu.lesson01.iteration;

import java.math.BigInteger;

public class Factorial {
  public static BigInteger calculate(int input) {

    BigInteger result = BigInteger.ONE;

    for (int i = 1; i <= input; i++) {
      result = result.multiply(BigInteger.valueOf(i));
    }

    return result;
  }
}
