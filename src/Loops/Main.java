package Loops;

public class Main {

    static void printNumbers(int limit) {
        for (int i = 1; i <= limit; i++) {
            System.out.println(i);
        }
    }


    static double calculateAverageOfNumbers(int limit) {
        int i = 0;
        int sum = 0;

        while (i <= limit) {
            sum += i;
            i++;
        }

        return sum / limit;
    }


    static String getQuarter(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> "invalid month";
        };
    }

    static void main() {
//        printNumbers(10);
        double average = calculateAverageOfNumbers(10);
        System.out.println(average);

        String month = "JULY";
        System.out.println(getQuarter(month));
    }
}
