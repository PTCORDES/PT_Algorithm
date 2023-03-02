package Chapter3_DFSBFS;

import java.util.ArrayList;

//DFS - 인접리스트
public class Algorithm_ChaeHyun_5_7 {

    private int index;
    private int distance;

    public Algorithm_ChaeHyun_5_7(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    public void show() {
        System.out.print("(" + this.index + "," + this.distance+ ") ");
    }


    //행 3개인 인접 리스트 표현
    public static ArrayList<ArrayList<Algorithm_ChaeHyun_5_7>> graph = new ArrayList<ArrayList<Algorithm_ChaeHyun_5_7>>();

    public static void main(String[] args) {
        //그래프 초기화
        for (int i = 0; i < 3; i++) {
            graph.add(new ArrayList<Algorithm_ChaeHyun_5_7>());
        }

        //노드1에 연결된 노드 정보 저장(노드번호, 거리)
        graph.get(0).add(new Algorithm_ChaeHyun_5_7(1, 7));
        graph.get(0).add(new Algorithm_ChaeHyun_5_7(2, 5));
        //노드2에 연결된 노드 정보 저장(노드번호, 거리)
        graph.get(1).add(new Algorithm_ChaeHyun_5_7(0, 7));
        //노드3에 연결된 노드 정보 저장(노드번호, 거리)
        graph.get(2).add(new Algorithm_ChaeHyun_5_7(0, 5));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < graph.get(i).size(); j++) {
                graph.get(i).get(j).show();
            }
            System.out.println();
        }
    }

}
