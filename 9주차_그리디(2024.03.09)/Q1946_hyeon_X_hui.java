/**
2024.03.09 페어프로그래밍
지시자: 희표, 작성자: 현선
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[][] arrays = new int[n][0];
            int max = Integer.MAX_VALUE;
            int answer = 0;

            Arrays.setAll(arrays, a -> new int[] {scanner.nextInt(), scanner.nextInt()});
            Arrays.sort(arrays, Comparator.comparingInt(o -> o[0]));
            for (int[] array : arrays) {
                if (max >= array[1]) {
                    max = array[1];
                    answer++;
                }
            }
            System.out.println(answer);
        }
        scanner.close();
    }
}
