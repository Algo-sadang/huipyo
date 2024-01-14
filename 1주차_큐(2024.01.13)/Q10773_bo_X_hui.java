/**
2024.01.13 페어프로그래밍
지시자: 보경, 작성자: 희표
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Queue<Integer> queue = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String s = scanner.next();

            switch (s) {
                case "push":
                    int a = scanner.nextInt();
                    queue.offer(a);
                    break;
                case "pop":
                    sb.append(queue.isEmpty() ? -1 : queue.poll()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append(queue.isEmpty() ? -1 : queue.peek()).append("\n");
                    break;
                case "back":
                    List<Integer> last = new ArrayList<>(queue);
                    sb.append(queue.isEmpty() ? -1 : last.get(last.size() - 1)).append("\n");
                    break;
            }
        }
        System.out.println(sb.toString().trim());
        scanner.close();
    }
}
