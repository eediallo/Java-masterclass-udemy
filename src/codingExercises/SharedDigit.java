package codingExercises;

/*
* Checking For A Shared Digit Between Two Numbers
Write a method named hasSharedDigit with two parameters of type int.

Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.

The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.



EXAMPLE INPUT/OUTPUT:

hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers

hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99

hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers



NOTE: The method hasSharedDigit​ should be defined as public static like we have been doing so far in the course.

NOTE: Do not add a main method to the solution code.

  

* */


import java.util.Arrays;

public class SharedDigit {

    static boolean isElementPresent(String[] arr, String key){
        boolean res = Arrays.asList(arr).contains(key);
        return res;
    }
    static boolean hasSharedDigit(int a, int b){

        boolean result = false;

        if( (a < 10 || a > 99) || (b < 10 || b > 99)){
            return false;
        }

        String[] numsA = String.valueOf(a).split("");
        String[] numsB = String.valueOf(b).split("");

        for(int i = 0; i < numsA.length; i++){
            if(isElementPresent(numsB, numsA[i])){
                result = true;
            }
        }

        return result;
    }

    static void main() {
        System.out.println(hasSharedDigit(10, 19));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

}
