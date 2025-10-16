package Loops.challenges;

public class LoopChallenges {
    static void main() {
        printPrimeNumbers(1000);
    }

    static void printPrimeNumbers(int limit){
        for(int i = 1; i <= limit; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int wholeNumber){
        if(wholeNumber <= 1){
            return false;
        }

        if (wholeNumber == 2){
            return true;
        }

        if(wholeNumber % 2 == 0){
            return false;
        }

        for(double i = 3; i <= Math.sqrt(wholeNumber); i+=2){
            if(wholeNumber % i == 0){
                return false;
            }
        }

        return true;
    }
}
