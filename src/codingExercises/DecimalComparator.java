package codingExercises;

public class DecimalComparator {

    static boolean areEqualByThreeDecimalPlaces(double firstDouble, double secondDouble){
        long firstDoubleRounded = (long) (firstDouble * 1000);
        long secondDoubleRounded = (long) (secondDouble * 1000);

        return firstDoubleRounded == secondDoubleRounded;
    }

    static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
    }
}
