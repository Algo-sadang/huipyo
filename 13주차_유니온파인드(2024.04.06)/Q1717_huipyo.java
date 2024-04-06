import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        int[] array = new int[n + 1];

        Arrays.setAll(array, i -> i);
        for (int i = 0; i < m; i++) {
            switch (scanner.nextInt()) {
                case 0:
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();

                    union(array, a, b);
                    break;
                case 1:
                    int parentA = find(array, scanner.nextInt());
                    int parentB = find(array, scanner.nextInt());

                    System.out.println(parentA == parentB ? "YES" : "NO");
                    break;
            }
        }
        scanner.close();
    }

    private static int find(int[] parents, int x) {
        return parents[x] == x ? x : (parents[x] = find(parents, parents[x]));
    }

    private static void union(int[] parents, int a, int b) {
        a = find(parents, a);
        b = find(parents, b);

        if (a < b) {
            parents[b] = a;
        } else {
            parents[a] = b;
        }
    }
}
