package codingExercises;

public class SumChecker {
    static boolean hasEqualSum(int p1, int p2, int p3) {
        return p3  == p1 + p2;
    }

    static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1));
    }
}
