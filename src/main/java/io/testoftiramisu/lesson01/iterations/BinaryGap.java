package io.testoftiramisu.lesson01.iterations;

class BinaryGap {

  /** Returns a String representation of number's binary value. */
  private String toBinaryRepresentation(int num) {
    StringBuilder builder = new StringBuilder();

    while (num > 0) {
      builder.append(num % 2);
      num /= 2;
    }

    builder.reverse();
    return builder.toString();
  }

  /**
   * Returns a longest binary gap (sequence of consecutive zeros that is surrounded by ones at both
   * ends) within of the binary representation of a positive integer.
   */
  public int getLongestBinaryGap(int number) {
    String binary = toBinaryRepresentation(number);

    char[] array = binary.toCharArray();

    int max = 0;
    int current = 0;

    for (char element : array) {
      if (element == '1') {
        if (current > max) {
          max = current;
        }
        current = 0;
      }

      if (element == '0') {
        current++;
      }
    }

    return max;
  }
}
