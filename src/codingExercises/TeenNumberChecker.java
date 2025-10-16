package codingExercises;

public class TeenNumberChecker {
    static boolean hasTeen(int v1, int v2, int v3) {
        boolean has_ten = false;

        if ((v1 >= 13 && v1 <= 19) || (v2 >= 13 && v2 <= 19) || (v3 >= 13 && v3 <= 19)) {
            has_ten = true;
        }

        return has_ten;
    }

    static boolean isTen(int age){
        return age >= 13 && age <= 19;
    }

    static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println( "IS_TEN = " + isTen(14));
    }
}
