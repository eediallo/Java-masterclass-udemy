package codingExercises;


/*
* Comprehensive 'Positive, Negative, Or Zero' Assessment In Java
Write a method called checkNumber with an int parameter named number.



The method should not return any value, and it needs to print out:

    - "positive" if the parameter number is > 0

    - "negative" if the parameter number is < 0

    - "zero" if the parameter number is equal to 0



NOTE:  The checkNumber method needs to be defined as public static like we have been doing so far in the course.

NOTE:  Do not add a main method to your solution code!

Gain a deeper understanding of Java decision-making structures by creating a program that categorizes numeric values as positive, negative, or zero.
*
* */

public class PositiveNegativeZero {
    static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }


    static void main(String[] args) {
        checkNumber(0);
    }

}
