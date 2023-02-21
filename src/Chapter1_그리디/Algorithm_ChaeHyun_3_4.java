package Chapter1_그리디;

import java.util.Scanner;

public class Algorithm_ChaeHyun_3_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int total = 0;
        boolean flag = true;

        while (flag) {
            if (n % k == 0) {
                n = n/k;
                if(n==1)
                    flag = false;
            }
            else
                n--;
            total++;
        }
        System.out.println(total);
    }

    //더 간단한 풀이
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
