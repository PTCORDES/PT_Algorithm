package Chapter6_다이나믹프로그래밍;

import java.util.Scanner;

//타일
//점화식 : a(i) = a(i-1) + 2 * a(i-2)
//타일 점화식
//핵심 : 같은 경우 고려해서 제외하고 점화식 구하기
public class Algorithm_ChaeHyun_8_7 {

    public static int[] d = new int[1001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        d[1] = 1;
        d[2] = 3;
        for (int i = 3; i <= n; i++) {
            d[i] = (d[i - 1] + 2 * d[i - 2]) % 796796;
        }

        System.out.println(d[n]);
    }

}
