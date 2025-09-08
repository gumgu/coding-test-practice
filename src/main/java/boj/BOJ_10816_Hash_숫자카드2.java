package main.java.boj;

import java.util.HashMap;
import java.util.Scanner;

public class BOJ_10816_Hash_숫자카드2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int number = sc.nextInt();
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        int M = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int number = sc.nextInt();
            sb.append(map.getOrDefault(number, 0)).append(" ");
        }

        System.out.println(sb.toString().trim());
    }

}
