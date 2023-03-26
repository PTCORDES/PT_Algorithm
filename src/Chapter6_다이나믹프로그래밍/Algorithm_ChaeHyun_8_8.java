package Chapter6_다이나믹프로그래밍;

import java.util.Arrays;
import java.util.Scanner;

//최소한의 화폐 구성
public class Algorithm_ChaeHyun_8_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] d = new int[m + 1];
        Arrays.fill(d, 10001);

        //다이나믹
        d[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = arr[i]; j <= m; j++) {
                if (d[j - arr[i]] != 10001) { //무조건 0
                    //배수로 차근차근 쌓아나간다
                    //배수로 쌓으면 이전에 값이 있으니까 계속해서 갱신이 되는 것
                    d[j] = Math.min(d[j], d[j - arr[i]] + 1);
                }
            }
        }

        if (d[m] == 10001) {
            System.out.println(-1);
        } else {
            System.out.println(d[m]);
        }
    }
}
