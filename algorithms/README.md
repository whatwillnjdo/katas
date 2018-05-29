# kata-May2018-tdd-algorithms
  * Practice TDD & Pair Programming
  
# This kata focuses on:
  * Test Driven Development (TDD)
  * Problem solving algorithms

# Rules for the kata:
  * Use the “RED – GREEN – REFACTOR” principle.
  
# Problem
    In this Kata we will be looking at the approach on how to solve problems. 
    The challenge can be solved in any programming language with TDD apprach.
                  
# STAGE 1:
  1. Create a class OddManOut.
  2. Problem: You are given an array (which will have a length of at least 3, but could be very large) containing integers. 
              The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N. 
              Write a method that takes the array as an argument and returns this "odd number out" N.
  3. Test Case 1: [2,3,4] should return 3 (because 3 is odd)
  4. Test Case 2: [1,2,3] should return 2 (because 2 is even) 
  5. Test Case 3: [2, 4, 0, 100, 4, 11, 2602, 36] should return 11
  6. Test Case 4: [160, 3, 1719, 19, 11, 13, -21] should return 160                                                                                         
  
# STAGE 2:
  1. Create a class MaskIt.
  2. Problem: Usually when you buy something, you're asked whether your credit card number, phone number or answer to your most secret question is still correct. 
              However, since someone could look over your shoulder, you don't want that shown on your screen. 
              Instead, we mask it.
              Your task is to write a function maskify(), which changes all but the last four characters into '#'.
  3. Test Case 1: maskify("1"); should return "1"
  4. Test Case 2: maskify(""); should return ""
  5. Test Case 3: maskify("Skippy"); should return "##ippy"
  6. Test Case 4: maskify("4556364607935616"); should return "############5616" 
            
# STAGE 3:
  1. Create a class Pattern.
  2. This time no story, no theory. The examples below show you how to write function patternChange().
  3. Test Case 1: patternChange("a"); should return "A"
  4. Test Case 2: patternChange("Ab"); should return "A-Bb"
  5. Test Case 3: patternChange("abcd"); should return "A-Bb-Ccc-Dddd"
  6. Test Case 4: patternChange("RqaEzty");; should return "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
  7. Test Case 5: patternChange("cwAt"); should return "C-Ww-Aaa-Tttt"
            
 # Happy Coding