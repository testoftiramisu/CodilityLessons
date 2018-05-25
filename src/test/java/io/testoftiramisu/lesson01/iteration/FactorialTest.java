package io.testoftiramisu.lesson01.iteration;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigInteger;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class FactorialTest {

  private static Stream<Arguments> argumentsProvider() {
    return Stream.of(
        Arguments.of(0, BigInteger.ONE),
        Arguments.of(1, BigInteger.valueOf(1)),
        Arguments.of(2, BigInteger.valueOf(2)),
        Arguments.of(3, BigInteger.valueOf(6)),
        Arguments.of(4, BigInteger.valueOf(24)),
        Arguments.of(10, new BigInteger("3628800")),
        Arguments.of(11, new BigInteger("39916800")),
        Arguments.of(12, new BigInteger("479001600")),
        Arguments.of(13, new BigInteger("6227020800")),
        Arguments.of(20, new BigInteger("2432902008176640000")));
  }

  @ParameterizedTest
  @MethodSource("argumentsProvider")
  void calculate(int number, BigInteger factorial) {
    assertThat(Factorial.calculate(number)).isEqualTo(factorial);
  }
}
