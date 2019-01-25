package edu.cnm.deepdive;

public class FizzBuzz {

  public static void main(String[] args) {
    String[] computedValues = fizzBuzz(1, 101); //(starting point, comma, ending point, inclusive)
    for (int i = 0; i < computedValues.length; i++) {
      System.out.println(computedValues[i]);
    }
  }

  public static String[] fizzBuzz(int start, int end) { //since start and end are defined in the computedValues call, they pass into this method
    String[] bins = new String[end - start];
    for (int i = start; i <= end; i++) {
      String envelope;
      if (i % 3 == 0) {
        envelope = "fizz";
      } else {
        envelope = "";
      }
      if (i % 5 == 0) {
        envelope += "buzz";
      }
      if (envelope.isEmpty()) {
        envelope += i;
      }
      bins[i - start] = envelope;
    }
    return bins;
  }
}
