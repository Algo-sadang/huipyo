/**
2024.01.27 페어프로그래밍
지시자: 보경, 작성자: 희표
*/

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        backtracking(new Stack<>(), n);
        scanner.close();
    }

    private static void backtracking(Stack<Integer> stack, int n) {
        for (int i = 1; i <= n; i++) {
            if (stack.contains(i)) continue;
            stack.push(i);
            if (stack.size() < n) backtracking(stack, n);
            else System.out.println(stack.stream().map(String::valueOf).collect(Collectors.joining(" ")));
            stack.pop();
        }
    }
}

/**
 * 처음에 작성한 코드
 */

/*public class Main {
    static boolean[] mVisited;

    static StringBuilder mSb = new StringBuilder();

    static int mCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        mVisited = new boolean[n];

        for (int i = 0; i < n; i++) {
            mCount = 0;
            dfs(i + 1);
            mSb.append("\n");
        }
        System.out.println(mSb);
        scanner.close();
    }

    private static void dfs(int i) {
        if (mCount == 2)
            mVisited = new boolean[mVisited.length];
        if (mVisited[i - 1]) {
            return;
        }
        mVisited[i - 1] = true;
        mSb.append(i).append(" ");
        for (int j = 0; j < mVisited.length; j++) {
            dfs(j + 1);
        }
    }
}*/
