/**
2024.02.24 프로그래밍
작성자: 희표
*/

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(solution(n));
        scanner.close();
    }

    public static int solution(int n) {
        return Stream.iterate(new AbstractMap.SimpleEntry<>(1, 2), fib -> new AbstractMap.SimpleEntry<>(fib.getValue(), (fib.getKey() + fib.getValue()) % 10_007))
                .limit(n)
                .reduce((acc, i) -> i)
                .orElseThrow()
                .getKey();
    }
}
