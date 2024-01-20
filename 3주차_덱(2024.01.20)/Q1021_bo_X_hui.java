import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        int answer = 0;
        Deque<Integer> deque = new ArrayDeque<>() { { for (int i = 0; i < n; i++) offer(i + 1); } };

        for (int i = 0; i < m; i++) {
            Deque<Integer> temp1 = new ArrayDeque<>(deque);
            Deque<Integer> temp2 = new ArrayDeque<>(deque);
            int num = scanner.nextInt();

            while ((!temp1.isEmpty() && temp1.peekFirst() != num) && temp2.peekFirst() != num) {
                answer++;
                temp1.offerFirst(temp1.pollLast());
                temp2.offerLast(temp2.pollFirst());
            }
            deque = (!temp1.isEmpty() && temp1.peekFirst() == num) ? temp1 : temp2;
            deque.pollFirst();
        }
        System.out.println(answer);
        scanner.close();
    }
}
