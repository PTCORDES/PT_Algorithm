package Chapter3_DFSBFS;

import java.util.ArrayList;

//dfs
public class Algorithm_ChaeHyun_5_8 {

    public static boolean[] visited = new boolean[9];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    //dfs 함수 정의
    public static void dfs(int x) {
        //현재 노드 방문 처리
        visited[x] = true;
        System.out.print(x + " ");

        //현재 노드 연결된 다른 노드 재귀적으로 방문
        //거의 대부분 숫자 낮은 순대로 됨
        for (int i = 0; i < graph.get(x).size(); i++) {
            int y = graph.get(x).get(i); //현재 노드// 와 연결된 다른 노드
            if(!visited[y]) dfs(y);
        }

        //풀이2
//        for (int node : graph[x]) {
//            // 인접한 노드가 방문한 적이 없다면 DFS 수행
//            if(!visited[node]) {
//                dfs(node);
//            }
//        }
    }

    public static void main(String[] args) {
        //초기화
        for (int i = 0; i < 9; i++) {
            graph.add(new ArrayList<Integer>());
        }

        // 노드 1에 연결된 노드 정보 저장
        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(8);

        // 노드 2에 연결된 노드 정보 저장
        graph.get(2).add(1);
        graph.get(2).add(7);

        // 노드 3에 연결된 노드 정보 저장
        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);

        // 노드 4에 연결된 노드 정보 저장
        graph.get(4).add(3);
        graph.get(4).add(5);

        // 노드 5에 연결된 노드 정보 저장
        graph.get(5).add(3);
        graph.get(5).add(4);

        // 노드 6에 연결된 노드 정보 저장
        graph.get(6).add(7);

        // 노드 7에 연결된 노드 정보 저장
        graph.get(7).add(2);
        graph.get(7).add(6);
        graph.get(7).add(8);

        // 노드 8에 연결된 노드 정보 저장
        graph.get(8).add(1);
        graph.get(8).add(7);

        dfs(1);
    }
}
