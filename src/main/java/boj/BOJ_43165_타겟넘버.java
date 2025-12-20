package boj;

public class BOJ_43165_타겟넘버 {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }

    // void가 아닌 int를 반환하여 호출한 곳으로 결과를 전달
    public int dfs(int[] numbers, int target, int index, int sum) {
        // 1. 종료 조건
        if (index == numbers.length) {
            return sum == target ? 1 : 0;
        }

        // 2. 수행 동작 (자식 노드들의 결과를 더해서 반환)
        return dfs(numbers, target, index + 1, sum + numbers[index])
                + dfs(numbers, target, index + 1, sum - numbers[index]);
    }
}
