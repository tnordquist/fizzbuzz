package edu.cnm.deepdive;

public class FizzBuzz {

  private static final int DEFAULT_ROOF = 100;

  public static void main(String[] args) {

    int roof = (args.length > 0) ? Integer.parseInt(args[0]) : DEFAULT_ROOF;
    for(int i = 1; i <= roof; ++i) {
      try {
        System.out.println(aResult(i));
      } catch (IllegalArgumentException ex) {
        System.out.println(i + "is an invalid number " + ex);
      }
    }

  }

  public static String aResult(int num) throws IllegalArgumentException {
    String result;

    if (num % 15 == 0) {
      result = "FizzBuzz";
    } else if (num % 3 == 0) {
      result = "Fizz";
    } else if (num % 5 == 0) {
      result = "Buzz";
    } else {
      result = String.valueOf(num); // Integer.toString(num)
    }
    return result;
  }

}