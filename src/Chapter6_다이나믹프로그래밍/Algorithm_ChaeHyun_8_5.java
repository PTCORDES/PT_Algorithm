package Chapter6_다이나믹프로그래밍;

import java.util.Scanner;

//1로 민들기
public class Algorithm_ChaeHyun_8_5 {
    public static int[] d = new int[30001];

    //풀이1
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        //1을 더해주는 이유 : 함수의 호출 횟수를 구해야 하기 때문
         //연산을 한번 수행했기 때문
//        for (int i = 2; i <= n; i++) {
//            //햔재 수에서 1빼는 경우
//            d[i]= d[i-1] + 1;
//
//            if(i % 2 ==0)
//                d[i] = Math.min(d[i], d[i / 2] + 1);
//            if(i % 3 ==0)
//                d[i] = Math.min(d[i], d[i / 3] + 1);
//            if(i % 5 ==0)
//                d[i] = Math.min(d[i], d[i / 5] + 1);
//        }
//        System.out.println(d[n]);
//    }

    //풀이2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        d[1] = 0;
        for (int i = 2; i <= n; i++) {
            d[i] = d[i-1] + 1;
            if (i % 2 == 0) {
                d[i] = Math.min(d[i], d[i / 2] + 1);
            }
            if (i % 3 == 0) {
                d[i] = Math.min(d[i], d[i / 3] + 1);
            }
            if (i % 5 == 0) {
                d[i] = Math.min(d[i], d[i / 5] + 1);
            }
        }
        System.out.println(d[n]);
    }
}
