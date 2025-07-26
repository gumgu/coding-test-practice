package main.java.boj;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class BOJ_5585_Greedy_거스름돈 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int change = 1000 - i;

        int residue = change;
        int count = 0;

        while(residue != 0) {
            count += residue / 500;
            residue %= 500;

            count += residue/ 100;
            residue %= 100;

            count += residue / 50;
            residue %= 50;

            count += residue / 10;
            residue %= 10;

            count += residue / 5;
            residue %= 5;

            count += residue / 1;
            residue %= 1;
        }

        System.out.println(count);

    }

}
