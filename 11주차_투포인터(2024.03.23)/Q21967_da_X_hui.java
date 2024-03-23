/**
 2024.03.23 페어프로그래밍
 지시자: 다은, 작성자: 희표
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int answer = 0;

        Arrays.setAll(arr, i -> scanner.nextInt());
        for (int i = 0; i < n; i++) {
            int min = 10;
            int max = 0;

            for (int j = i; j < n; j++) {
                min = Math.min(min, arr[j]);
                max = Math.max(max, arr[j]);

                if (max - min <= 2) {
                    answer = Math.max(answer, j - i + 1);
                }
            }
        }
        System.out.println(answer);
        scanner.close();
    }
}
