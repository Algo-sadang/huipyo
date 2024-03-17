/**
2024.03.16 페어프로그래밍
지시자: 희표, 작성자: 현선
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt(), n = scanner.nextInt();
        int[] array = new int[n];

        Arrays.setAll(array, i -> scanner.nextInt());
        System.out.println(binarySearch(m, array));
        scanner.close();
    }

    private static int binarySearch(int m, int[] array) {
        int left = 1, right = Arrays.stream(array).max().orElse(0);
        int result = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            int total = Arrays.stream(array).map(i -> i / mid).sum();

            if (total >= m) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
