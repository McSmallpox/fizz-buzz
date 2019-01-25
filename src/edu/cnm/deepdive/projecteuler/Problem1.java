package edu.cnm.deepdive.projecteuler;

public class Problem1 {

  public static void main(String[] args) {
    System.out.println(fizzBuzzSum(1, 1000));
  }

  public static long fizzBuzzSum(int start, int end) {
    long sum = 0;

    for (int i = start; i < end; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum += i;
      }
    }
    return sum;
  }
}