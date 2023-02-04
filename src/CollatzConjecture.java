public class CollatzConjecture {
    public static void main(String[] args) {
        System.out.println(a(8575));
    }

    static long a(long n) {
        System.out.println(n);
        int count = 0;
        while (n != 1) {
            count++;

            if (n % 2 == 0) {
                n = n / 2;
            } else n = n * 3 + 1;
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("It is count");
        return count;
    }
}