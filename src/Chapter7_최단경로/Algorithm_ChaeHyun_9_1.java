package Chapter7_최단경로;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//시간 복잡도 O(V^2)
//간단한 다익스트라 알고리즘
////최단 거리가 가장 짧은 노드를 매번 선형 탐색
//class Node {
//
//    private int index; //노드 번호
//    private int distance; //간선 길이
//
//    public Node(int index, int distance) {
//        this.index = index;
//        this.distance = distance;
//    }
//
//    public int getIndex() {
//        return this.index;
//    }
//
//    public int getDistance() {
//        return this.distance;
//    }
//
//}

public class Algorithm_ChaeHyun_9_1{
    public static final int INF = (int)1e9; //무한을 의미하는 값
    //n:노드의 개수 m: 간선의 개수, start: 시작 노드 번호
    public static int n, m, start;
    //노드의 정보를 담는 배열
    public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
    //방문한 적 있는지 체크
    public static boolean[] visited = new boolean[100001];
    //최단 거리 테이블
    public static int[] d = new int[10001];

    public static int getSmallestNode() {
        int min_value = INF;
        int index = 0;

        //선형 탐색
        for (int i = 1; i <= n; i++) {
            if (d[i] < min_value && !visited[i]) {
                min_value = d[i];
                index = i;
            }
        }
        return index;
    }

    public static void dijkstra(int start) {
        //시작 노드에 대해 초기화
        d[start] = 0;
        visited[start] = true;
        for (int j = 0; j < graph.get(start).size(); j++) {
            d[graph.get(start).get(j).getIndex()] = graph.get(start).get(j).getDistance();
        }

        //시작 노드를 제외한 전체 n-1 개의 노드
        for (int i = 0; i < n - 1; i++) {
            //시작 노드가 아닌 다음을 꺼내기 위해
            //현재 최단 거리가 가장 짧은 노드 꺼내서, 방문 처리
            int now = getSmallestNode();
            visited[now] = true;
            //현재 노드와 연결된 다른 노드
            for (int j = 0; j < graph.get(now).size(); j++) {
                int cost = d[now] + graph.get(now).get(j).getDistance();
                if (cost < d[graph.get(now).get(j).getIndex()]) {
                    d[graph.get(now).get(j).getIndex()] = cost;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //n:노드의 개수 m: 간선의 개수, start: 시작 노드 번호
        n = scanner.nextInt();
        m = scanner.nextInt();
        start = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Node>());
        }

        // 모든 간선 정보를 입력받기
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            // a번 노드에서 b번 노드로 가는 비용이 c라는 의미
            graph.get(a).add(new Node(b, c));
        }

        //최단 거리 테이블 : 무한으로 초기화
        //d라는 테이블을 무한으로 초기화
        Arrays.fill(d, INF);

        dijkstra(start);

        for (int i = 1; i <= n; i++) {
            if (d[i] == INF) {
                System.out.println("INFINITY");
            } else {
                System.out.println(d[i]);
            }
        }
    }
}
