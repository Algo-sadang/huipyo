/**
2024.03.06 개인문제풀이
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        int[] array = new int[m];
        int[] prefixSums = initPrefixSums(scanner, array, n);
        int a = scanner.nextInt();
        int answer = prefixSums[a - 1];

        for (int k = a; k < m; k++) {
            answer = Math.max(answer, prefixSums[k] - prefixSums[k - a]);
        }
        System.out.println(answer);
        scanner.close();
    }

    private static int[] initPrefixSums(Scanner scanner, int[] array, int repeatCount) {
        int[] result = new int[array.length];

        for (int i = 0; i < repeatCount; i++) {
            for (int j = 0; j < array.length; j++) {
                array[j] += scanner.nextInt();
                result[j] = array[j] + (j > 0 ? result[j - 1] : 0);
            }
        }
        return result;
    }
}
