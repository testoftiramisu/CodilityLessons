package io.testoftiramisu.lesson03.timecomplexity;

public class FrogJmp {

  public int solution(int x, int y, int d) {

    int destination = y - x;
    int jumps = destination / d;

    if (destination % d != 0) {
      jumps++;
    }

    return jumps;
  }
}
