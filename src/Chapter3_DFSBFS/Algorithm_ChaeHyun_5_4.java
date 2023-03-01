package Chapter3_DFSBFS;

//재귀 ㅎ마수는 스택 자료 구조
//함수를 계속 호출했을 때 가장 마지막에 호출한 함수가 먼저 수행을 끝내가 그 앞의 함수 호출이 종료
//1->100번째 함수 호출합니다, 99->1 종료합니다
public class Algorithm_ChaeHyun_5_4 {

    public static void recursiveFunction(int i) {
        if(i==100)
            return;
        System.out.println(i + "번째 재귀 함수에서 "  + (i + 1) + "번째 재귀 함수를 호출합니다.");
        recursiveFunction(i + 1);
        System.out.println(i + "번쩨 재귀 함수를 종료합니다.");
    }
    public static void main(String[] args) {
        recursiveFunction(1);
    }
}
