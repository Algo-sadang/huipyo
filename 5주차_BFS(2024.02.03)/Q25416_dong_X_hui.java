/**
2024.02.03 페어프로그래밍
지시자: 동휘 + 희표, 작성자: 희표
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dest = new int[2];
        List<List<Integer>> lists = new ArrayList<>() {
            {
                for (int i = 0; i < 5; i++) {
                    int finalI = i;
                    add(new ArrayList<>() {
                        {
                            for (int j = 0; j < 5; j++) {
                                int temp = scanner.nextInt();
                                if(temp == 1) {
                                    dest[0] = finalI;
                                    dest[1] = j;
                                }
                                add(temp);
                            }
                        }
                    });
                }
            }
        };
        int[] arr = new int[] {scanner.nextInt(), scanner.nextInt()};
        int result = bfs(lists, new HashSet<>(List.of(new AbstractMap.SimpleEntry<>(arr[0], arr[1]))), arr, dest);

        System.out.println(result);
        scanner.close();
    }

    private static int bfs(
            List<List<Integer>> lists,
            Set<AbstractMap.SimpleEntry<Integer, Integer>> visited,
            int[] start,
            int[] dest
    ) {
        Queue<Pair<int[], Integer>> queue = new ArrayDeque<>(List.of(new Pair<>(start, 0)));

        while (!queue.isEmpty()) {
            Pair<int[], Integer> temp = queue.poll();
            int[] current = temp.getFirst();
            int result = temp.getSecond();

            if (current[0] == dest[1] && current[1] == dest[0]) {
                return result;
            }
            for (int[] next : new int[][] {
                    {current[0] - 1, current[1]},
                    {current[0], current[1] + 1},
                    {current[0] + 1, current[1]},
                    {current[0], current[1] - 1}
            }) {
                if (visited.contains(new AbstractMap.SimpleEntry<>(next[0], next[1]))) continue;
                if (next[0] < 0 || next[1] < 0 || next[0] >= 5 || next[1] >= 5) continue;
                if (lists.get(next[0]).get(next[1]) == 0) {
                    visited.add(new AbstractMap.SimpleEntry<>(next[0], next[1]));
                    queue.offer(new Pair<>(next, result + 1));
                }
            }
        }
        return -1;
    }
}

class Pair<F, S> {
    private final F first;

    private final S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
