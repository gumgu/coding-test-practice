package main.java.programmers;

import java.util.HashMap;
import java.util.Map;

public class PRO_42576_Hash_완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        // 인터페이스 사용 (Map)
        Map<String ,Integer> map = new HashMap<>();

        // 참가자 카운팅
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        // 완주자 차감
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }

        // 결과 반환: entrySet()을 사용하여 재조회 비용 절감
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 0) { // 1인 경우 혹은 그 이상
                return entry.getKey();
            }
        }

        return null;
    }

}
