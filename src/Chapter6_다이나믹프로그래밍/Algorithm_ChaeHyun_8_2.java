package Chapter6_다이나믹프로그래밍;

//피보나치 수열 - 다이나믹 프로그래밍
//메모이제이션에 값을 저장하는 방법(캐싱)
//재귀함수 - O(N)
//큰 문제를 작은 문제로 나눌 수 있어야 함
//작은 문제에서 구한 정답은 그것을 포함하는 큰 문제에서도 동일
public class Algorithm_ChaeHyun_8_2 {

    //한번 계산될 결과를 Memoization하기 위한 배열
    public static long[] d = new long[100];

    public static long fibo(int x) {
        if (x == 1 || x == 2) {
            return 1;
        }
        //이미 계산한 적이 있는 문제라면 그대로 반환
        //이미 계산했으면 숫자가 들어가 있다, 계산한 적 없음 = 0
        if (d[x] != 0) {
            return d[x];
        }

        d[x] = fibo(x - 1) + fibo(x - 2);
        return d[x];
    }
    public static void main(String[] args) {
        System.out.println(fibo(50));
    }
}
// 큰 문제를 작은 문제로 나누고
// 같은 문제라면 한 번씩만 풀어 문제를 효울적으로 해결하는 알고리즘
// 재귀 함수이므로 오버헤드가 발생할 수 있다