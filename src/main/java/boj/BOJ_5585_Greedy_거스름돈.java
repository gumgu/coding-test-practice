package main.java.boj;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class BOJ_5585_Greedy_거스름돈 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int price = scanner.nextInt();
        int change = 1000 - price;

        int[] coins = {500, 100, 50, 10, 5, 1};
        int count = 0;

        for (int coin : coins) {
            count =+ change / coin;
            change %= coin;
        }

        System.out.println(count);
    }
}
