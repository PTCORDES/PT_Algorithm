package Chapter17_최단경로문제;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

//class Node implements Comparable<Node> {
//    private int x;
//    private int y;
//    private int distance;
//
//    public Node(int x, int y, int distance) {
//        this.x = x;
//        this.y = y;
//        this.distance = distance;
//    }
//
//    public int getX() {
//        return x;
//    }
//
//    public int getY() {
//        return y;
//    }
//
//    public int getDistance() {
//        return distance;
//    }
//
//    @Override
//    public int compareTo(Node o) {
//        if(this.distance<o.distance) return -1;
//        return 1;
//    }
//}

//public class Algorithm_ChaeHyun_17_3 {
//
//    public static final int INF = (int) 1e9;
//    public static int [][] graph = new int[126][126];
//    public static int[][] d = new int[126][126];
//    public static int T, n;
//    public static int[] dx = {-1, 0, 1, 0};
//    public static int[] dy = {0, 1, 0, -1};
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        T = sc.nextInt();
//
//        for (int i = 0; i < T; i++) {
//            n = sc.nextInt();
//            for (int a = 0; a < n; a++) {
//                for (int b = 0; b < n; b++) {
//                    graph[a][b] = sc.nextInt();
//                }
//            }
//
//            for (int j= 0; j < 126; j++) {
//                Arrays.fill(d[j], INF);
//            }
//
//            //시작 노드는 0,0
//            int x = 0;
//            int y = 0;
//
//            PriorityQueue<Node> pq = new PriorityQueue<>();
//            pq.offer(new Node(0, 0, graph[x][y]));
//            d[x][y] = graph[x][y];
//
//            while (!pq.isEmpty()) {
//                //제일 먼저 삽입된 노드 정보 꺼내기
//                Node node = pq.poll();
//                int distances = node.getDistance();
//                x = node.getX();
//                y = node.getY();
//
//                // 현재 노드가 이미 처리된 적이 있는지
//                if(d[x][y] <distances) continue;
//                for (int k = 0; k < 4; k++) {
//                    int nx = x + dx[k];
//                    int ny = y + dy[k];
//
//                    //맵 범위 체크
//                    if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
//                    int cost = distances + graph[nx][ny];
//                    // 현재 노드를 거쳐서, 다른 노드로 이동하는 거리가 더 짧은 경우
//                    if (cost < d[nx][ny]) {
//                        d[nx][ny] = cost;
//                        pq.offer(new Node(nx, ny, cost));
//                    }
//                }
//            }
//
//            System.out.println(d[n - 1][n - 1]);
//        }
//
//    }
//}
