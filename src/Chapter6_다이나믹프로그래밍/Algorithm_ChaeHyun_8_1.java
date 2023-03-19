package Chapter6_다이나믹프로그래밍;

//다이나믹 프로그래밍
//피보나치 수열 - 재귀함수로 구현
//동일한 함수가 반복적으로 수행됨
//ex) fibo(6) = Fibo(5) + fibo(4) 각깍에서 같은 함수가 반복적으로 수행
public class Algorithm_ChaeHyun_8_1 {

    public static int fibo(int x) {
        if(x==1 || x==2)
            return 1;
        return fibo(x - 1) + fibo(x - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibo(4));
    }
}
