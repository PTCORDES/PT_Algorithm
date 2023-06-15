package Chapter1_그리디;

import java.util.Scanner;

public class Algorithm_ChaeHyun_3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int result = 0;

        while (true) {
            //N이 M으로 나누어 떨어지는 수가 될 때까지 한번에 1씩 빼기
            int target = (N/M) * M; //if n=27 M = 5 target = 25
            result+= N - target; //result = 2 2번 빼야 하니까
            N = target; //N = 25

            if (N < M) {
                break;
            }
            //N을 M으로 나누기
            result+=1;
            N /= M;
        }
        //마지막으로 남은 수에 대해 1을 빼기
        result+=(N-1);
        System.out.println(result);
    }

//풀이1
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int total = 0;
//        boolean flag = true;
//
//        while (flag) {
//            if (n % k == 0) {
//                n = n/k;
//                if(n==1)
//                    flag = false;
//            }
//            else
//                n--;
//            total++;
//        }
//        System.out.println(total);
//    }

//     풀이2
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int total = 0;
//
//        while (n != 1) {
//            total++;
//            if (n % k == 0) {
//                n /= k;
//                continue; //해당 반복 부분 나오고 다음 반복 이어서 한다(밑부분 무시)
//            }
//            n--;
//        }
//        System.out.println(total);
//    }
}
