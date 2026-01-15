package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11720_숫자의합 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();

        int result = 0;

        String[] strNumbers = input.split("");
        for (int i = 0; i < n; i++) {
            result += Integer.parseInt(strNumbers[i]);
        }

        System.out.println(result);
    }
}
