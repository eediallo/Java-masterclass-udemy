package Loops.challenges;

public class LoopChallenges {

    static void printPrimeNumbers(int limit) {
        for (int i = 1; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 1) {
            return false;
        }

        if (wholeNumber == 2) {
            return true;
        }

        if (wholeNumber % 2 == 0) {
            return false;
        }

        for (double i = 3; i <= Math.sqrt(wholeNumber); i += 2) {
            if (wholeNumber % i == 0) {
                return false;
            }
        }

        return true;
    }

    static void countPrimeNumbers(int wholeNumber) {
        int primeNumbersCount = 0;

        for (int i = 0; i <= wholeNumber; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                primeNumbersCount++;

                if (primeNumbersCount == 3) {
                    break;
                }
            }
        }
    }


    static void sumNumbersDivisibleByTheeAndFive() {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                count++;
                System.out.println(i + " is divisible by 3 and 5");

                if (count == 5) {
                    break;
                }
            }
        }

        System.out.println("Sum => " + sum);
    }


    static boolean isEvenNumber(int n) {
        return n % 2 == 0;
    }

    static void printEvenNumbers(int start, int end) {
        int i = start;

        while (i <= end) {
            if (isEvenNumber(i)) {
                System.out.println(i + " is an even number.");
            }
            i++;
        }
    }

    static int sumDigit(int n){
        if (n < 0) {
            return -1;
        }

        int sum = 0;

        while(n > 0){
            // extract the last digit
            int digit = n % 10;
            sum += digit;

            // remove the last digit
            n /= 10;
        }

        return sum;
    }


    static void main() {
//        printPrimeNumbers(1000);
//        countPrimeNumbers(10);

        // sumNumbersDivisibleByTheeAndFive();

//        printEvenNumbers(5, 20);
        System.out.println(sumDigit(1000));
        System.out.println(sumDigit(125));
    }
}
