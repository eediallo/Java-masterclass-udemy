package codingExercises;

import java.util.Scanner;

public class MinMaxChallenge {
    static void minMax(){
        double min = 0;
        double max = 0;
        Scanner scanner = new Scanner(System.in);

        int loopCount = 0;

        boolean valid = true;

        while(valid){
            System.out.println("Enter a number of q to quit: ");
            String valueEntered = scanner.nextLine();
            System.out.println(valueEntered.equals("q"));

            if (valueEntered.equals("q")){
                System.out.println("Program exiting");
                break;
            }

            try{
                double num = Double.parseDouble(valueEntered);
                System.out.println(num);
                if (loopCount == 0 || num < min){
                    min = num;
                }

                if (loopCount  == 0 || num > max){
                    max = num;
                }
                loopCount++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number.");
                break;
            }
        }

        System.out.println("min = " + min +  " and max = " + max);
    }
}
