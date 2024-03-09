/**
2024.03.09 페어프로그래밍
지시자: 희표, 작성자: 현선
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arrays = new int[n][2];
        int max = 0;
        int answer = 0;

        Arrays.setAll(arrays, i -> new int[] {sc.nextInt(), sc.nextInt()});
        Arrays.sort(arrays, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });
        for (int i = 0; i < n; i++) {
            if (max <= arrays[i][0]) {
                max = Math.max(max, arrays[i][1]);
                answer++;
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
