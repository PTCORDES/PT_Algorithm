package Chapter5_이진탐색;

import java.util.Scanner;

//계수 정렬
//인덱스에 접근하여 확인
public class Algorithm_ChaeHyun_7_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //가게 부품 개수
        int n = sc.nextInt();
        int[] arr = new int[1000001];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr[x] = 1;
        }

        //손님이 확인 요청한 부품 target
        int m = sc.nextInt();
        int[] targets = new int[n];
        for (int i = 0; i < m; i++) {
            targets[i] = sc.nextInt();
        }

        //계수 정렬로 확인
        for (int i = 0; i < m; i++) {
            //해당 부품이 존해하는지
            if (arr[targets[i]] == 1) {
                System.out.print("Yes ");
            } else {
                System.out.print("no ");
            }
        }
    }
}
