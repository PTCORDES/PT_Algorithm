package Chapter17_최단경로문제;

import java.util.Arrays;
import java.util.Scanner;

public class Algorithm_ChaeHyun_17_1 {
    public static final int INF = (int) 1e9;
    public static int n, m;
    public static int[][] graph = new int[101][101];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //n: 도시의 개수, m: 버스의 개수
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 0; i < 101; i++) {
            Arrays.fill(graph[i], INF);
        }

        for (int k = 0; k < n; k++) {
            for (int j = 0; j < n; j++) {
                if(k==j) graph[k][j] = 0;
            }
        }

        for (int i = 0; i < m; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int distance = sc.nextInt();
            graph[start][end] = distance;
        }

        for (int k = 1; k <= n; k++) {
            for (int a = 1; a <= n; a++) {
                for (int b = 1; b <= n; b++) {
                    graph[a][b] = Math.min(graph[a][b], graph[a][k] + graph[k][b]);
                }
            }
        }
        //출력
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                if (graph[a][b] == INF) {
                    System.out.print("0" + " ");
                } else {
                    System.out.print(graph[a][b]+ " ");
                }
            }
            System.out.println();
        }
    }
}
