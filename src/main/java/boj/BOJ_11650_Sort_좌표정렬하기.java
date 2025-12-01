package boj;

import java.io.*;
import java.util.*;

public class BOJ_11650_Sort_좌표정렬하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 2차원 배열로 처리 (객체 생성 오버헤드 감소)
        int[][] points = new int[N][2];

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            points[i][0] = Integer.parseInt(st.nextToken());
            points[i][1] = Integer.parseInt(st.nextToken());
        }

        // 람다식을 활용한 정렬 (Comparator)
        Arrays.sort(points, (p1, p2) -> {
            if (p1[0] == p2[0]) {
                return p1[1] - p2[1]; // x가 같으면 y비교
            }
            return p1[0] - p2[0]; // x비교
        });

        StringBuilder sb = new StringBuilder();
        for(int[] point : points) {
            sb.append(point[0]).append(" ").append(point[1]).append('\n');
        }
        System.out.print(sb);
    }
}