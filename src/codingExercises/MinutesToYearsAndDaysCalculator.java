package codingExercises;

public class MinutesToYearsAndDaysCalculator {
    static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
    }

    static void printYearsAndDays(long minutes){
        int minutesPerDay = 24 * 60;
        int daysPerYear = 365;
        int minutesPerYear = minutesPerDay * daysPerYear;

        if(minutes < 0){
            System.out.println("Invalid Value");
            return;
        }

        long years = minutes / minutesPerYear;
        long days = (minutes / minutesPerDay) % daysPerYear;

        System.out.println(minutes + " min = " + years + " y and " + days + " d");

    }
}
