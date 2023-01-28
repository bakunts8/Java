public class Main {
    public static void main(String[] args) {
        int[][] array = {
                {17, 2, 5, 65, 48, 12, 45, 12},
                {15, 45, 5, 47, 8, 65, 78, 14},
                {8, 65, 78, 14, 15, 45, 5, 78},
                {15, 45, 5, 47, 8, 65, 78, 14},
                {8, 65, 78, 14, 15, 45, 5, 78},
                {17, 2, 5, 65, 48, 12, 45, 12},
                {15, 45, 5, 47, 8, 65, 78, 14},
                {8, 65, 78, 14, 15, 45, 5, 78},
        };
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        System.out.print(sum);
    }
}