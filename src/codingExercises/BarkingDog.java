package codingExercises;

public class BarkingDog {
    static boolean shouldWakeUp(boolean barking, int hourOfDay){
        boolean isBarking = false;

        if (hourOfDay < 0 || hourOfDay > 23){
            return isBarking;
        }

        if(barking && (hourOfDay < 8 || hourOfDay > 22)){
            isBarking = true;
        }

        return isBarking;
    }


    static void main(String[] args) {
        boolean isBarking = shouldWakeUp(true, -1);
        System.out.println(isBarking);
    }
}
