package Chapter7_최단경로;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

//개선된 다익스트라 알고리즘
//O(ElogV)
//우선순위 큐 - 이미 처리된 노드는 무시
//E 개의 원소를 우선순위 큐에 넣었다가 모두 빼내는 연산
//최대 E개의 간선 데이터를 힙에 넣었다가 다시 빼는 것
//class Node implements Comparable<Node> {
//    private int index;
//    private int distance;
//
//    public Node(int index, int distance) {
//        this.index = index;
//        this.distance = distance;
//    }
//
//    public int getIndex() {
//        return index;
//    }
//
//    public int getDistance() {
//        return distance;
//    }
//
//    //거리가 짧은 것이 높은 우선순위 가지도록 설정하는 부분
//    @Override
//    public int compareTo(Node o) {
//        if (this.distance < o.distance) {
//            return -1;
//        }
//        return 1;
//    }
//}
public class Algorithm_ChaeHyun_9_2 {

    public static final int INF = (int) 1e9;
    public static int n, m, start;
    public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
    public static int[] d = new int[10001];

    public static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        //시작 노드는 최단 경로 0으로 큐 삽입(start, 0)
        pq.offer(new Node(start, 0));
        d[start] = 0;

        while (!pq.isEmpty()) {
            //제일 먼저 삽입된 노드 정보 꺼내기
            Node node = pq.poll();
            int distances = node.getDistance();
            int now = node.getIndex();

            if(d[now]<distances) continue;
            for (int i = 0; i < graph.get(now).size(); i++) {
                int cost = d[now] + graph.get(now).get(i).getDistance();
                if (cost < d[graph.get(now).get(i).getIndex()]) {
                    d[graph.get(now).get(i).getIndex()] = cost;
                    pq.offer(new Node(graph.get(now).get(i).getIndex(), cost));
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        start = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Node>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new Node(b, c));
        }

        Arrays.fill(d, INF);

        dijkstra(start);

        for (int i = 1; i <= n; i++) {
            if (d[i] == INF) {
                System.out.println("INFINITY");
            }
            else {
                System.out.println(d[i]);
            }
        }
    }
}
