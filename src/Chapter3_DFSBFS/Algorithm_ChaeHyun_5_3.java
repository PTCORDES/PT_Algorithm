package Chapter3_DFSBFS;

//재귀 함수 - 특정한 함수가 자기 자신을 포함한다
public class Algorithm_ChaeHyun_5_3 {

    public static void recursiveFunction() {
        System.out.println("call recursive Function!!");
        recursiveFunction();
    }
    public static void main(String[] args) {
        recursiveFunction();
    }

    //재귀의 최대 깊이를 초과했다
}
