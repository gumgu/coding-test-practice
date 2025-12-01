package programmers;

import java.lang.*;
import java.util.*;


public class PRO_42746_가장큰수 {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();

        // String 배열로 변경
        List<String> strArr = new ArrayList<>();
        for (int number : numbers) {
            strArr.add(String.valueOf(number));
        }

        // 정렬
        strArr.sort(new Sorting());

        // 리턴값 생성
        for (String s : strArr) {
            answer.append(s);
        }

        // 반환값이 0으로 시작하는 경우 처리
        if (answer.toString().startsWith("0")) {
            return "0";
        }

        return answer.toString();
    }
}

class Sorting implements Comparator<String> {
    public int compare(String s1, String s2) {
        int plus1 = Integer.parseInt(s1 + s2);
        int plus2 = Integer.parseInt(s2 + s1);
        return Integer.compare(plus2, plus1);
    }
}
























//
//public class PRO_42746_가장큰수 {
//    public String solution(int[] numbers) {
//        String answer = "";
//
//        // 각 자리를 숫자로 가지는 배열 생성
//        List<int[]> numberArr = new ArrayList<>();
//        for (int num : numbers) {
//            String strNum = num + "";
//            String[] strNumArr = strNum.split("");
//
//            int[] numArr = new int[4];
//            for (int i = 0; i < 4; i++) {
//                if (strNumArr[i] != null) {
//                    numArr[i] = Integer.parseInt(strNumArr[i]);
//                } else {
//                    numArr[i] = 0;
//                }
//            }
//
//            numberArr.add(numArr);
//        }
//
//        // 각 숫자들을 정렬
//        Collections.sort(numberArr, new Sorting());
//
//        // for 최종 값 결산
//        String result = "";
//        for (int[] number : numberArr) {
//            for (int i : number) {
//                result += i + "";
//            }
//        }
//        return result;
//    }
//
//}
//
//class Sorting implements Comparator<int[]> {
//    public int compare(int[] arr1, int[] arr2) {
//        for (int i = 0; i < 4; i++) {
//            if (arr1[i] > (arr2[i])) {
//                return -1;
//            } else if (arr1[i] == arr2[i]) {
//                return 0;
//            } else {
//                return 1;
//            }
//        }
//        return 0;
//    }
//}
