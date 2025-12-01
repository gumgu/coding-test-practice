package boj;
import java.io.*;
import java.util.*;

public class BOJ_11650_Sort_좌표정렬하기 {

    // 1. 클래스는 static으로 선언하여 메모리 효율을 높이고 외부 참조를 끊는다.
    // 가독성을 위해 DTO(Data Transfer Object)처럼 활용.
    static class Point implements Comparable<Point> {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            // 2. 분기 처리를 최소화한 정렬 로직
            // x가 다르면 x끼리 비교, 같으면 y끼리 비교
            if (this.x != o.x) {
                return this.x - o.x;
            }
            return this.y - o.y;
        }
    }

    public static void main(String[] args) throws IOException {
        // 3. 입력 속도 최적화 (BufferedReader)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 4. ArrayList 대신 배열 사용
        // N의 크기를 이미 알고 있으므로, 동적으로 크기가 늘어나는 List보다
        // 고정 크기 배열이 메모리와 속도 면에서 훨씬 유리함.
        Point[] points = new Point[N];

        for (int i = 0; i < N; i++) {
            // 5. split 대신 StringTokenizer 사용 (문자열 파싱 비용 절감)
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            points[i] = new Point(x, y);
        }

        // 6. 배열 정렬 (Arrays.sort는 내부적으로 Dual-Pivot Quicksort 혹은 TimSort 사용)
        Arrays.sort(points);

        // 7. 출력 속도 최적화 (StringBuilder)
        // System.out.println을 10만 번 호출하는 것은 매우 느림.
        StringBuilder sb = new StringBuilder();
        for (Point p : points) {
            sb.append(p.x).append(' ').append(p.y).append('\n');
        }

        System.out.print(sb);
    }
}
