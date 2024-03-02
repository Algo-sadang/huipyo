/**
2024.03.02 페어프로그래밍
지시자: 희표, 작성자: 다은
*/

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        int[] array = new int[n];
        int[] prefixSumArray = new int[n];

        Arrays.setAll(array, i -> scanner.nextInt());
        Arrays.setAll(prefixSumArray, i -> i == 0 ? array[i] : prefixSumArray[i - 1] + array[i]);
        for (int a = 0; a < m; a++) {
            int i = scanner.nextInt(), j = scanner.nextInt();

            System.out.println(prefixSumArray[j - 1] - (i > 1 ? prefixSumArray[i - 2] : 0));
        }
        scanner.close();
    }
}
