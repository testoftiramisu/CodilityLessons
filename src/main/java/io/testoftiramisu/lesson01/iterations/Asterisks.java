package io.testoftiramisu.lesson01.iterations;

public class Asterisks {

  public static void main(String[] args) {
    Asterisks.drawTriangle(5);
    Asterisks.drawVerticalTriangle(5);
  }

  /*
   * Prints triangle with asterisks.
   * For five rows:
   *  *
   *  **
   *  ***
   *  ****
   *  *****
   */
  private static void drawTriangle(int rows) {
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < i + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  /*
   * Prints vertical triangle with asterisks.
   * For five rows:
   *  *********
   *   *******
   *    *****
   *     ***
   *      *
   */
  private static void drawVerticalTriangle(int rows) {
    for (int i = rows; i > 0; i--) {
      for (int j = 0; j < rows - i; j++) {
        System.out.print(" ");
      }
      for (int k = i * 2 - 1; k > 0; k--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
