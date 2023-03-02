package Chapter3_DFSBFS;

//DFS-인접행렬_2차원 배열
public class Algorithm_ChaeHyun_5_6 {

    public static final int INF = 99999999; //무한의 비용

    public static int[][] graph = { //NxM 표라고 생각하기
            {0, 7, 5},
            {7, 0, INF},
            {5, INF, 0}
    };
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}
