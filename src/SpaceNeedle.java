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
        System.out.println();

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
        //System.out.println();


//        // Top Half
//        System.out.print("|");
//
//
//        // Middle
//        System.out.print("|");
//
//        for (int i = 0; i < SIZE * 3; i++){
//            System.out.print("\"");
//        }
//        System.out.print("|");
//
//
//        //System.out.println("");

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
        System.out.println();

        for (int line = 1; line <= SIZE; line++) {
            System.out.print("\\_");
            for (int space = 3*SIZE-1; space >= SIZE + 1; space-=2) {
                System.out.print(" ");

            }
            //System.out.println();
            System.out.print("<>");

        }

    }
}

