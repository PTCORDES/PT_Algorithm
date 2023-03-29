package Chapter7_최단경로;

import java.util.Arrays;
import java.util.Scanner;

//플로이드 워셜
//모든 지점에서 다른 모든 지점가지의 최단 경로를 모두 구해야하는 경우
//O(N^3)
//다이나믹 프로그래밍
//Dab = min(Dab, Dak + Dkb) 최단 거리를 갱신
//노드의 개수 = step의 개수
public class Algorithm_ChaeHyun_9_3 {
    public static final int INF = (int) 1e9;
    //N: 노드의 개수 M:간선의 개수
    //노드의 개수 최대 500
    public static int n, m;
    //2차원 배열
    public static int[][] graph = new int[501][501];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        // 최단 거리 테이블을 모두 무한으로 초기화
        for (int i = 0; i < 501; i++) {
            Arrays.fill(graph[i], INF);
        }

        //자기 자신에서 자기 자신으로 가는 경우는 없으므로 비용 0으로 초기화
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                if(a==b) graph[a][b] = 0;
            }
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph[a][b] = c;
        }

        //플로이드 워셜 알고리즘
        for (int k = 1; k <= n; k++) {
            for (int a = 1; a <= n; a++) {
                for (int b = 1; b <= n; b++) {
                    graph[a][b] = Math.min(graph[a][b], graph[a][k] + graph[k][b]);
                }
            }
        }

        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                if (graph[a][b] == INF) {
                    System.out.print("INFINITY");
                } else {
                    System.out.print(graph[a][b] + " ");
                }
            }
            System.out.println();
        }
    }
}
