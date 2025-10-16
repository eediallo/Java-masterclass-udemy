package codingExercises;

public class OverloadedMethod {

    static double convertToCentimeters(int inches){
        return inches * 2.54;
    }

    static double convertToCentimeters(int feet, int inches){
        //return convertToCentimeters((feet * 12) + inches);
        int feetToInches = 12 * feet;
        int totalInches = feetToInches + inches;
        return convertToCentimeters(totalInches);
    }

    static void main(String[] args) {
        System.out.println("68in = " + convertToCentimeters(68) + "cm");
        System.out.println("5f and 5in = " + convertToCentimeters(5, 5) + "cm");

    }
}
