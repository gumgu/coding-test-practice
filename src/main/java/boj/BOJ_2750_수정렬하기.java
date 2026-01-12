package boj;

import java.io.*;
import java.util.*;
import java.lang.*;

public class BOJ_2750_수정렬하기 {
    public static void main (String[] args) throws IOException {
        // 1. 입력 가속: BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 2. 출력 가속: 매번 출력하지 않고 StringBuilder에 모았다가 한번에 출력
        StringBuilder sb = new StringBuilder();

        // 첫 줄에 데이터 개수 N이 들어온다고 가정
        int n = Integer.parseInt(br.readLine());

        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(br.readLine());
            intList.add(value);
        }
        Collections.sort(intList);

        for (int i = 0; i < n; i++) {
            sb.append(intList.get(i)).append('\n');
        }

        System.out.println(sb);
    }
}
