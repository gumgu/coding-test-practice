package main.java.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class PRO_52583_Queue_다리를지나는트럭 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        int time = 0;
        int sum = 0;  // 현재 다리 위 트럭들의 무게 합
        int idx = 0;  // 다음 대기 중인 트럭 인덱스

        // 다리 위를 bridge_length만큼 0으로 채운다
        for (int i = 0; i < bridge_length; i++) {
            bridge.offer(0);
        }

        // 트럭이 모두 다리위에 올라갈때까지 반복
        while (idx < truck_weights.length) {
            time++;

            // 맨 앞 트럭을 제거
            sum -= bridge.poll();

            // 다음 트럭을 올릴 수 있는지 확인
            if (sum + truck_weights[idx] <= weight) {
                // 있으면 다리위에 올리기
                bridge.offer(truck_weights[idx]);
                sum += truck_weights[idx];
                idx++;
            } else {
                // 없으면 빈자리
                bridge.offer(0);
            }
        }

        // while문은 트럭을 다리에 올리는 것에만 사용됨
        // 따라서, 마지막 트럭이 다리 끝까지 가는 거리인 bridge_length만큼 추가
        return time + bridge_length;
    }
}
