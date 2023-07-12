package practice;

public class RightTriangle {
    /*

    *
    **
    ***
    ****


     */
    public static void main(String[] args) {
        for (int x = 0; x < 4; x++) {
            for (int i = x; i < 4; i++) {
                System.out.print(" ");
            }
            for (int i = 4-x; i <= 4; i++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
