package Chapter6_다이나믹프로그래밍;

//피보나치 수열 (반복문으록 구현)
//다이나믹 프로그래밍 - 보텀업 방식
//작은 문제부터 차근차근 답을 도출한다 ( 상향식 )
//다이나믹 프로그래밍의 전형적인 형태
//보텀업에서는 메모이제이션이 아니라 dp 테이블
public class Algorithm_ChaeHyun_8_4 {

    public static long[] d = new long[100];

    public static void main(String[] args) {
        d[1] = 1;
        d[2] = 1;
        int n = 50;

        for (int i = 3; i <= n; i++) {
            d[i] = d[i - 1] + d[i - 2];
        }
        System.out.println(d[n]);
    }
}
