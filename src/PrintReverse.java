import java.util.Scanner;

public class PrintReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = n;
        int c;
        int y = 0;
        for (int i = 0; i < a(n); i++) {
            c = x % 10;
            x /= 10;
            for (int l = i; l < a(n); l++) {
                if (l + 1 != a(n)) {
                    c *= 10;
                }
            }
            y += c;
        }
        System.out.println(y);
    }

    static int a(int n) {
        int a = 0;
        for (int i = 1; i < n; i *= 10) {
            a++;
        }
        return a;
    }
}
