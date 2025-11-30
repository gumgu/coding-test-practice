package boj;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ_11650_Sort_좌표정렬하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Point> numbers = new ArrayList<Point>();
        for (int i = 0; i < N; i++) {
            // ** 문제 시작
            String number = br.readLine();
            String[] split = number.split(" ");

            // 분할한 문자로부터 Point 생성
            Point point = new Point(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
            numbers.add(point);
        }

        // 최종 조합된 숫자 데이터 정렬
        Collections.sort(numbers);

        for (Point point : numbers){
            System.out.println(point.x + " " + point.y);
        }
    }
}

class Point implements Comparable<Point> {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point point) {
        if (this.x == point.x) {
            return this.y > point.y ? 1 : (this.y == point.y ? 0 : -1);
        }
        return this.x > point.x ? 1 : (this.x == point.x ? 0 : -1);
    }
}