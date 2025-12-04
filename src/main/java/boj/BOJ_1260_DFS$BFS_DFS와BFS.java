package boj;

import java.util.*;
import java.io.*;
import java.lang.*;

public class BOJ_1260_DFS$BFS_DFS와BFS {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 정점수 간선수 시작정점
        String[] arrInfo = br.readLine().split(" ");

        int nodeCnt = Integer.parseInt(arrInfo[0]);
        int edgeCnt = Integer.parseInt(arrInfo[1]);
        int startVertex = Integer.parseInt(arrInfo[2]);

        // 그래프 초기화
        for (int i = 0; i <= nodeCnt; i++) {
            graph.add(new ArrayList<>());
        }

        // 그래프 생성
        for (int i = 0; i < edgeCnt; i++) {
            String[] edgeInfo = br.readLine().split(" ");

            int a = Integer.parseInt(edgeInfo[0]);
            int b = Integer.parseInt(edgeInfo[1]);

            // 양방향 지정
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        // 그래프 정렬
        for (List<Integer> edge : graph) {
            Collections.sort(edge);
        }

        visited = new boolean[nodeCnt + 1];
        dfs(startVertex);

        System.out.println();

        visited = new boolean[nodeCnt + 1];
        bfs(startVertex);
    }

    static void dfs(int node) {
        // 1. 현재 노드 위치
        visited[node] = true;
        System.out.print(node + " ");

        // 2. 다음 노드
        for (int nextNode : graph.get(node)) {
            // 3. 다음 노드가 이미 방문한 노드가 아닌 경우
            if (!visited[nextNode]) {
                dfs(nextNode);
            }
        }
    }

    static void bfs(int startNode) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(startNode);

        while(!queue.isEmpty()) {
            int currentNode = queue.poll();

            // 현재 노드
            System.out.print(currentNode + " ");
            visited[currentNode] = true;

            // 현재 노드와 연결된 곳들을 확인
            for(int nextNode : graph.get(currentNode)) {
                // 아직 방문하지 않은 곳이라면?
                if (!visited[nextNode]) {
                    queue.offer(nextNode); // 큐(대기열)에 등록
                    visited[nextNode] = true; // 미리 방문 표시 (중복 방지)
                    // 이게 양방향이여서 visited인가?
                }
            }
        }
    }
}
