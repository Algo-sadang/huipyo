/**
2024.01.06 페어프로그래밍
지시자: 희표, 작성자: 보경
*/

import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String s = sc.next();
       
            
            switch (s) {
                case "push" : st.push(sc.nextInt());
                    break;
                case "pop" : sb.append(st.isEmpty() ?-1 : st.pop()).append("\n");
                    break;
                case "top" : sb.append(st.isEmpty() ? -1 : st.peek()).append("\n");
                    break;
                case "size" : sb.append(st.size()).append("\n");
                    break;
                case "empty" : sb.append(st.isEmpty() ? 1 : 0).append("\n");
                    break;
            }  
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
