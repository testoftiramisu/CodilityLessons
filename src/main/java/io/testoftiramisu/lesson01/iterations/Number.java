package io.testoftiramisu.lesson01.iterations;

public final class Number {
  private int number;
  private StringBuilder builder;

  Number(int number) {
    this.number = number;
  }

  public int getNumber() {
    return number;
  }

  /** Returns number of digits in decimal representation of a number */
  public int countDigits() {
    int result = 0;
    int num = number;

    while (num > 0) {
      num /= 10;
      result++;
    }
    return result;
  }

  /** Returns a String representation of number's binary value grouped by octets. */
  public String getBinaryRepresentationInOctets() {
    builder = new StringBuilder(getBinaryRepresentation());

    while (builder.length() % 4 != 0) {
      builder.insert(0, "0");
    }

    return builder.toString();
  }

  /** Returns a String representation of number's binary value. */
  public String getBinaryRepresentation() {
    int num = number;
    builder = new StringBuilder();

    while (num > 0) {
      builder.append(num % 2);
      num /= 2;
    }

    builder.reverse();
    return builder.toString();
  }
}
