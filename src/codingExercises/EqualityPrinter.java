package codingExercises;

public class EqualityPrinter {

    static void printFeedbackMessage(String message){
        System.out.println(message);
    }

    static void printEqual(int a, int b, int c) {

        if (a < 0 || b < 0 || c < 0) {
            printFeedbackMessage("Invalid Value");
            return;
        }

        if (a == b && a == c){
            printFeedbackMessage("All numbers are equal");
            return;
        }


        if ( (a != b && a != c) && (b != a && b != c) && (c != a && c != b) ){
            printFeedbackMessage("All numbers are different");
            return;
        }

        printFeedbackMessage("Neither all are equal or different");
    }

    static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(1, 2, 3);
        printEqual(2, 1, 1);
    }
}
