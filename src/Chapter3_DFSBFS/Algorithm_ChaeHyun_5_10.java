package Chapter3_DFSBFS;

import java.util.Scanner;

public class Algorithm_ChaeHyun_5_10 {

    public static int n, m;
    public static int[][] graph = new int[1000][1000];

    public static boolean dfs(int x, int y) {
        //범위 벗어나는 경우 종료
        if (x <= -1 || x >= n || y <= -1 || y >= m) {
            return false;
        }
        //현재 노드 방문x
        if (graph[x][y] == 0) {
            graph[x][y] = 1;
            //상하좌우 재귀적으로 호출(연결된 것 확인)
            dfs(x - 1, y);
            dfs(x , y-1);
            dfs(x+1, y);
            dfs(x, y+1);
            return true;
        }
        //방문했을 때 false
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;

        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                //현재 위치에서 dfs
                if (dfs(i, j)) { //dfs에서 true를 반환할 경우
                    result +=1;
                }
            }
        }
        System.out.println(result);
    }
}
