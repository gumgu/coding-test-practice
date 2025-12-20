package boj;

public class BOJ_43165_타겟넘버 {
    int count = 0;
    int[] numbers;
    int target;

    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;

        dfs(0, 0);

        return count;
    }

    public void dfs(int index, int sum) {
        // 탈출 조건
        if (index == numbers.length) {
            if (sum == target) {
                count++;
            }
            return;
        }

        dfs(index + 1, sum + numbers[index]);
        dfs(index + 1, sum - numbers[index]);
    }
}
