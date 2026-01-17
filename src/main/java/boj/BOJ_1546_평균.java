package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1546_평균 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()); // 한 줄을 통째로 문자열로 읽음

        double max = 0L;
        double sum = 0L;

        for (int i = 0; i < n; i++) {
            double num = Double.parseDouble(st.nextToken());

            sum += num;      // 리스트에 넣지 않고 바로 합계 누적
            if (max < num) { // 정렬 대신 비교로 최댓값 찾기 (O(N))
                max = num;
            }
        }

        double result = (sum / max * 100)/n;
        System.out.println(result);
    }
}
