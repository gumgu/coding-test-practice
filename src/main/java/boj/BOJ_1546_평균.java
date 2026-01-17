package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ_1546_평균 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 과목 개수 입력
        String numbers = br.readLine(); // 한 줄을 통째로 문자열로 읽음

        String[] strNumbers = numbers.split(" ");

        // 1. 파라미터를 list로 변환
        List<Integer> intNumbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            intNumbers.add(Integer.parseInt(strNumbers[i]));
        }

        // 2. 정렬해서 최대값 구하기
        Collections.sort(intNumbers, Collections.reverseOrder());
        int max = intNumbers.get(0);

        // 3. 각 점수 가공
        List<Double> adjustedNumbers = new ArrayList<>();
        for (int i =0; i <n; i++) {
            adjustedNumbers.add(intNumbers.get(i) / (double) max + 100);
        }

        // 4. 평균 구하기
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += adjustedNumbers.get(i);
        }
        double result = sum / adjustedNumbers.size();

        // 5. 정답 출력
        System.out.println(result);
    }
}
