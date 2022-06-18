// Liana Wu
// 6.18.2022
// CSE142
// Take-home Assessment #2
//
// A program that produces as ASCII Art



public class SpaceNeedle {

    public static final int LINES_NUM = 5;
    public static final int SIZE = 3;


    public static void main(String[] args) {
        //asciiArt();
        needle();
        //System.out.println();
        topUpperHalf();
        topLowerHalf();
        //System.out.println();
        pillar();
        topUpperHalf();

    }

    // Custom Ascii Art - Rocket
    public static void asciiArt() {

        for (int i = 0; i < LINES_NUM; i++) {
            System.out.println("     *     ");
            System.out.println("    ---    ");
            System.out.println("    | |    ");
            System.out.println("    | |    ");
            System.out.println("    ---    ");
            System.out.println("    ^^^    ");
            System.out.println();
        }
    }

    public static void needle() {

        for (int lines = 0; lines < SIZE; lines++) {
            for (int i = SIZE * 3; i > 0; i--) {
                System.out.print(" ");
            }
            System.out.println("||");
        }
    }

    public static void topUpperHalf() {

        for (int line = 0; line <= SIZE - 1; line++) {
            for (int space = 1; space <= (line * -3 + (2 * SIZE)); space++) {
                System.out.print(" ");
            }
            System.out.print("__/");
            for (int dot = 0; dot <= (line * SIZE - 1); dot++) {
                System.out.print(":");
            }
            System.out.print("||");
            for (int dot = 0; dot <= (line * SIZE - 1); dot++) {
                System.out.print(":");
            }
            System.out.println("\\__");
        }

        // Middle Of Top Half
        System.out.print("|");

        for (int i = 0; i <= SIZE * 6; i++) {
            System.out.print("\"");
        }
        System.out.print("|");
    }

    public static void topLowerHalf(){
        //System.out.println();

        //System.out.println("\\_/\\/\\/\\/\\/\\/\\/\\/\\_/");
        System.out.println();

        //System.out.print("\\_");


        for (int line = 0; line <= SIZE - 1; line++) {
            //System.out.print("line"+ line);

            for (int space = 1; space <= line * 2; space++) {
                System.out.print(" ");
            }
            System.out.print("\\_");

            for (int space = 8 - (line * 2); space >= 1; space--) {
                System.out.print("/\\");
                //System.out.print("space" + space);

            }

            System.out.print("_/");
            System.out.println();

        }






    }

    public static void pillar() {

        for (int line = 1; line <= SIZE * 3; line++) {
            for (int space = 0; space <= (SIZE * 2); space++) {
                System.out.print(" ");
            }

            System.out.print("|");

            for (int space = 1; space <= (SIZE / 2); space++) {
                System.out.print("%");
            }

            System.out.print("||");

            for (int space = 1; space <= (SIZE / 2); space++) {
                System.out.print("%");
            }

            System.out.print("|");
            System.out.println();
        }
    }
}

