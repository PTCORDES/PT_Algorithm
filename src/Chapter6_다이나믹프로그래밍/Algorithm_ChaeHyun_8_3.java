package Chapter6_다이나믹프로그래밍;

//실제로 호출되는 함수 확인
//f(6)-f(5)-f(4)-f(3)-f(2)-f(1)-f(2)-f(3)-f(4)
//f(1), f(2), f(3), f(4) 는 이미 값이 저장되어 있으므로 나누어지지 않고 그대로 호출만
//재귀 함수 이용해 다이나믹 프로그래밍 소스 코드 작성하는 방법
//탑다운 방 ( 하향식 )
public class Algorithm_ChaeHyun_8_3 {

    public static long[] d = new long[100];

    public static long fibo(int x) {
        System.out.print("f(" + x + ") ");
        if (x == 1 || x == 2) {
            return 1;
        }
        if (d[x] != 0) {
            return d[x];
        }
        //아직 계산하지 않은 문제라면 점화식에 따라서 피보나치 결과 반환
        d[x] = fibo(x - 1) + fibo(x - 2);
        return d[x];
    }
    public static void main(String[] args) {
        fibo(6);
    }
}
