package codingExercises;

import java.util.Scanner;

public class SumUserInput {
     public static void sumNumbersFromUserInput(){
        Scanner scanner = new Scanner(System.in);
        double numsSum = 0;

        int i = 1;
        while(i <= 5){
            System.out.println("Enter number #" + i);
            String numberString = scanner.nextLine();
            try{
//                int number = Integer.parseInt(numberString);
                double number = Double.parseDouble(numberString);
                numsSum += number;
                i++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            }

        }
        System.out.println("The sum of the 5 numbers is  : " + numsSum);
    }

}
