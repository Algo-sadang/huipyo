/**
2024.01.27 페어프로그래밍
지시자: 보경스, 작성자: 희표
*/

import java.util.*;

public class Main {
    private static final int[][] MOVE = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int h = scanner.nextInt();
            int w = scanner.nextInt();
            int[][] grid = new int[h][w];
            boolean[][] visited = new boolean[h][w];
            int count = 0;

            for (int j = 0; j < h; j++) {
                String temp = scanner.next();

                for (int k = 0; k < w; k++) {
                    grid[j][k] = temp.charAt(k) == '#' ? 1 : 0;
                }
            }
            for (int j = 0; j < h; j++) {
                for (int k = 0; k < w; k++) {
                    if (!visited[j][k] && grid[j][k] == 1) {
                        dfs(j, k, grid, visited);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
        scanner.close();
    }

    private static void dfs(int h, int w, int[][] grid, boolean[][] visited) {
        if (visited[h][w]) return;
        visited[h][w] = true;

        for (int i = 0; i < 4; i++) {
            int nextH = h + MOVE[i][0];
            int nextW = w + MOVE[i][1];

            if (nextH < 0 || nextW < 0 || nextH >= grid.length || nextW >= grid[0].length) continue;
            if (grid[nextH][nextW] == 1 && !visited[nextH][nextW]) {
                dfs(nextH, nextW, grid, visited);
            }
        }
    }
}
