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

    static void main() {
        char character = 'e';
        System.out.println(getNatoAlphabet(character));
        printDayOfWeek(5);

    }
}
