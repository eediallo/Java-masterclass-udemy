package codingExercises;

public class MegaByteConverter {
    static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value.");
            return;
        }

        int megaBytes = kiloBytes / 1024;
        int remainingKilobytes = kiloBytes % 1024;
        System.out.printf("%d KB = %d MB and %d KB", kiloBytes, megaBytes, remainingKilobytes);
    }


    static void main(String[] args) {
        printMegaBytesAndKiloBytes(8983883);
    }

}
