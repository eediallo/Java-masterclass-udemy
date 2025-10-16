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

    static void main() {
        char character = 'e';
        System.out.println(getNatoAlphabet(character));


    }
}
