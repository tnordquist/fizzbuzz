package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

   static final int[] INPUT = {1,2,3,4,5,75};
   static final String[] EXPECTED = {"1","2","Fizz","4","Buzz","FizzBuzz"};

  @Test
  void aFizzBuzzResult() {

    for(int i = 0; i < INPUT.length; ++i){
      int input = INPUT[i];
      String expected = EXPECTED[i];
      assertEquals(expected,FizzBuzz.aResult(input));
    }

  }
}