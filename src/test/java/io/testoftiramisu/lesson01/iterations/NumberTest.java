package io.testoftiramisu.lesson01.iterations;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class NumberTest {

  private Number number;

  @Test
  @DisplayName("Count digits in 1000")
  void countDigitsThousand() {
    number = new Number(1000);
    assertThat(number.countDigits()).isEqualTo(4);
  }

  @Test
  @DisplayName("Count digits in Million")
  void countDigitsMillion() {
    number = new Number(1_000_000);
    assertThat(number.countDigits()).isEqualTo(7);
  }

  @Test
  @DisplayName("Count digits in 123456789")
  void countDigitsFromOneToNine() {
    number = new Number(123_456_789);
    assertThat(number.countDigits()).isEqualTo(9);
  }

  @Test
  @DisplayName("Get binary representation of 7 in octets.")
  void binaryRepresentationOfSevenInOctets() {
    number = new Number(7);
    assertThat(number.getBinaryRepresentationInOctets()).isEqualTo("0111");
  }

  @Test
  @DisplayName("Get binary representation of 10 in octets.")
  void binaryRepresentationOfTenInOctets() {
    number = new Number(10);
    assertThat(number.getBinaryRepresentationInOctets()).isEqualTo("1010");
  }

  @Test
  @DisplayName("Get binary representation of 32 in octets.")
  void binaryRepresentationOfThirtyTwoInOctets() {
    number = new Number(32);
    assertThat(number.getBinaryRepresentationInOctets()).isEqualTo("00100000");
  }

  @Test
  @DisplayName("Get binary representation of 1041 in octets.")
  void binaryRepresentationOfOneThousandFortyOneInOctets() {
    number = new Number(1041);
    assertThat(number.getBinaryRepresentationInOctets()).isEqualTo("010000010001");
  }

  @Test
  @DisplayName("Get binary representation of 1041.")
  void binaryRepresentationOfOneThousandFortyOne() {
    number = new Number(1041);
    assertThat(number.getBinaryRepresentation()).isEqualTo("10000010001");
  }
}
