import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input number of Christmas tree rows");
        int lines = s.nextInt();
        int x = 2 * lines + 1;
        int y = lines;

        for (int i = 0; i < lines; i++) {

            for (int j = y; j > 0; j--) {
                System.out.print(" ");
            }

            for (int a = 2 * y + 1; a <= x && a >= 0; a += 2) {
                System.out.print("*");
            }

            y--;
            x += 2;
            System.out.println();
        }
    }
}
