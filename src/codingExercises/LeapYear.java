package codingExercises;

public class LeapYear {
    static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }


        boolean is_leap_year = false;

        if (year % 4 == 0) {
            is_leap_year = true;

            if (year % 100 == 0) {

                if (year % 400 == 0) {
                    is_leap_year = true;
                } else {
                    is_leap_year = false;
                }
            }
        } else {
            is_leap_year = false;
        }

        return is_leap_year;
    }

    static void main(String[] args) {
        System.out.println(isLeapYear(2100));
    }
}
