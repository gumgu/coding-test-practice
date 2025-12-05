package programmers;

import java.util.HashMap;
import java.util.Map;

public class PRO_42578_Hash_의상 {
    public int solution(String[][] clothes) {
        // 코니의 옷 목록 생성
        Map<String, Integer> conysClothes = new HashMap<>();

        for (String[] clothe : clothes) {
            String key = clothe[1];
            if (!conysClothes.containsKey(key)) {
                conysClothes.put(key, 1);
            } else {
                conysClothes.put(key, conysClothes.get(key) + 1);
            }
        }

        // 코니가 입을 수 있는 서로 다른 옷의 조합 수
        int result = 1;
        for (Map.Entry<String, Integer> map : conysClothes.entrySet()) {
            result *= ( map.getValue() + 1);

        }
        return result - 1;
    }
}
