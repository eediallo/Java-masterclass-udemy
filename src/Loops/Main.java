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
        switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> {
                return "1st";
            }
            case "APRIL", "MAY", "JUNE" -> {
                return "2nd";
            }

            case "JULY", "AUGUST", "SEPTEMBER" ->{
                return "3rd";
            }
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> {
                return "4th";
            }
            default -> {
                return "invalid month";
            }

        }
    }

    static void main() {
//        printNumbers(10);
        double average = calculateAverageOfNumbers(10);
        System.out.println(average);

        String month = "MAY";
        System.out.println(getQuarter(month));
    }
}
