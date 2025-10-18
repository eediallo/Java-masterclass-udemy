package codingExercises;

public class FlourPacker {
    static boolean canPack(int bigCount, int smallCount, int goal) {
        int bigBagKilos = bigCount * 5;

        int sum = bigBagKilos + smallCount;

        if (sum > goal) {
            return bigCount % 2 == 0;
        }

        return sum >= goal;
    }

    static void main() {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
    }
}
