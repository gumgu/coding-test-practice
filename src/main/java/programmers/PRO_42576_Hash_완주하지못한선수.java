package main.java.programmers;

import java.util.HashMap;

public class PRO_42576_Hash_완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        // 참가자 순환하며 참여 목록 Map 에 저장
        HashMap<String, Integer> participants =     new HashMap<>();
        for (String parti : participant) {
            participants.put(parti, participants.getOrDefault(parti, 0) + 1);
        }

        // 완료자 순환하며 참가자 count--;
        for (String comple : completion) {
            participants.put(comple, participants.get(comple) - 1);
        }

        // Map의 value중 1인 데이터를 반환
        for (String key : participants.keySet()) {
            Integer value = participants.get(key);

            if (value == 1) {
                return key;
            }
        }

        return null;
    }

}
