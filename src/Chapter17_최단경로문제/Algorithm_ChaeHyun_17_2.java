package Chapter17_최단경로문제;

import java.util.Arrays;
import java.util.Scanner;

public class Algorithm_ChaeHyun_17_2 {

    public static final int INF = (int) 1e9;
    //N: 노드의 개수 M:간선의 개수
    public static int n, m;
    public static int[][] graph = new int[501][501];


    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 0; i < 501; i++) {
            Arrays.fill(graph[i], INF);
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int a = 1; a <= n; a++) {
                for (int b = 1; b <= n; b++) {
                    if (a == b) graph[a][b] = 0;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int a = 1; a <= n; a++) {
                for (int b = 1; b <= n; b++) {
                    graph[a][b] = Math.min(graph[a][b], graph[a][i] + graph[i][b]);
                }
            }
        }

        for (int a = 1; a <= n; a++) {
            int count = 0;
            for (int b = 1; b <= n; b++) {
                if (graph[a][b] != INF || graph[b][a] != INF) {
                    count++;
                }
            }
            if(count == n) result++;
        }

        System.out.println(result);
    }
}