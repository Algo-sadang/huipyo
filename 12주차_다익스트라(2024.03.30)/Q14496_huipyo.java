/**
2024.03.30 솔로프로그래밍
작성자: 희표
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();
        int n = scanner.nextInt(), m = scanner.nextInt();
        Map<Integer, List<Integer>> graph = new HashMap<>() {
            {
                for (int i = 0; i < m; i++) {
                    int first = scanner.nextInt();
                    int second = scanner.nextInt();

                    computeIfAbsent(first, integer -> new ArrayList<>()).add(second);
                    computeIfAbsent(second, integer -> new ArrayList<>()).add(first);
                }
            }
        };
        Queue<int[]> queue = new ArrayDeque<>(List.of(new int[] {a, 0}));
        Set<Integer> visited = new HashSet<>(List.of(a));

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            if (current[0] == b) {
                System.out.println(current[1]);
                return;
            }
            for (int next : graph.getOrDefault(current[0], Collections.emptyList())) {
                if (visited.contains(next)) continue;
                visited.add(next);
                queue.offer(new int[] {next, current[1] + 1});
            }
        }
        System.out.println(-1);
        scanner.close();
    }
}
