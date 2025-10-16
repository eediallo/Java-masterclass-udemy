package Loops.challenges;

public class SwitchChallenge {


    static String getNatoAlphabet(char character) {

        return switch (character) {
            case 'A' | 'a' -> "Able";
            case 'B' | 'b' -> "Baker";
            case 'C' | 'c' -> "Charlie";
            case 'D' | 'd' -> "Dog";
            case 'E' | 'e' -> "Easy";
            default -> {
                String badResponse = character + " is an invalid character";
                yield badResponse;
            }
        };

    }


    static void printDayOfWeek(int day) {
        String dayOfWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };

        System.out.println(day + " stands for " + dayOfWeek);
    }



    static  void printNumberInWord(int n){
        String numberInWord = switch (n) {
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "OTHER";
        };

        System.out.println(numberInWord);
    }

    static void main() {
        char character = 'e';
        System.out.println(getNatoAlphabet(character));

        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);

        printNumberInWord(6);

    }
}
