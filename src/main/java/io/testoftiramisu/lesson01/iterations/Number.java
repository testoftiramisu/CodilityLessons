package io.testoftiramisu.lesson01.iterations;

public class Number {
  private int number;
  private StringBuilder builder;

  Number(int number) {
    this.number = number;
  }

  public int getNumber() {
    return number;
  }

  public int countDigits() {
    int result = 0;
    int num = number;

    while (num > 0) {
      num /= 10;
      result++;
    }
    return result;
  }

  public String getBinaryRepresentationInOctets() {
    builder = new StringBuilder(getBinaryRepresentation());

    while (builder.length() % 4 != 0) {
      builder.insert(0, "0");
    }

    return builder.toString();
  }

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
