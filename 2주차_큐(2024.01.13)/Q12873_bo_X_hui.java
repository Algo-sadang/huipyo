/**
2024.01.13 페어프로그래밍
지시자: 보경, 작성자: 희표
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Queue<Integer> queue = new ArrayDeque<>() {
            {
                for (int i = 0; i < n; i++) offer(i + 1);
            }
        };
        int stage = 1;

        while (queue.size() > 1) {
            for (int i = 0; i < (Math.pow(stage, 3) - 1) % queue.size(); i++) {
                queue.offer(queue.poll());
            }
            stage++;
            queue.poll();
        }
        System.out.println(queue.peek());
        scanner.close();
    }
}
