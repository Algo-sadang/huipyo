/**
2024.01.13 페어프로그래밍
지시자: 희표, 작성자: 보경
*/

import java.util.*;

import static java.lang.String.valueOf;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        List<String> sl = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>() {
            {
                for(int i = 1; i <= n; i++){
                    offer(i);
                }
            }
        };

        while(!q.isEmpty()){
            for(int i = 0; i < k-1; i++){
                q.offer(q.poll());
            }
            sl.add(valueOf(q.poll()));
        }

        System.out.println("<" + String.join(", ", sl) + ">");
        sc.close();
    }
}
