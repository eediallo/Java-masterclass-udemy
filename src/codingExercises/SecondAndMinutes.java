package codingExercises;

public class SecondAndMinutes {

    static String formatUnit(int value){

        if(value >= 10 ){
            return String.format("%d", value);
        }
        return String.format("0%d", value);
    }

    static String getDurationString(int seconds){

        if(seconds < 0) {
            return "Invalid data for seconds(" + seconds + "), must be a positive integer value.";
        }

        int minutes = seconds / 60;
        return getDurationString(minutes % 60, seconds % 60);

    }


    static String getDurationString(int minutes, int seconds){

        if ((minutes < 0)){
            return "Invalid data for minutes(" + minutes + "), must be a positive integer value.";
        }

        if((seconds < 0 || seconds > 59)){
            return "Invalid data for seconds(" + minutes + "), must be a positive integer value between 0 and 59.";
        }


        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return String.format("%sh %sm %ss", formatUnit(hours), formatUnit(remainingMinutes), formatUnit(seconds));

    }
    static void main(String[] args) {

        System.out.println(getDurationString(-65, 24));
        System.out.println(getDurationString(125, 25));
        System.out.println(getDurationString(-99));
        System.out.println(getDurationString(120));

    }
}
