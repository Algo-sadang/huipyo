/**
2024.01.06 페어프로그래밍
지시자: 보경, 작성자: 인경
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        int ans = 0;

        for(int i = 0; i < n; i ++){
            int t = sc.nextInt();

            if(t == 0){
                ans -= st.pop();
            } else{
                st.push(t);
                ans += t;
            }
        }
        
        System.out.println(ans);
        sc.close();
    }
}
