package boj;

import java.io.*;
import java.util.*;
import java.lang.*;

public class BOJ_2750_수정렬하기 {
    public static void main (String[] args) throws IOException {
        // 1. 빠른 입력 (BufferedReader)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 2. 빠른 출력 (StringBuilder)
        StringBuilder sb = new StringBuilder();

        // N 입력 받기
        int n = Integer.parseInt(br.readLine());

        // [최적화 포인트 1] ArrayList<Integer> 대신 int[] 사용
        // - 이유: Integer 객체 생성 오버헤드 제거, 메모리 사용량 감소, 캐시 적중률(Locality) 향상
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // [최적화 포인트 2] Arrays.sort() 사용
        // - Primitive 타입 배열 (int[]) 정렬 시 Dual-Pivot Quicksort 사용
        // - 평균 O(N log N)으로 매우 빠름
        Arrays.sort(arr);

        for (int i = 0; i <n; i++) {
            sb.append(arr[i]).append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}
