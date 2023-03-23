package Chapter6_다이나믹프로그래밍;

import java.util.Scanner;

//개미전사
public class Algorithm_ChaeHyun_8_6 {

    //풀이1 - 다이나믹x
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        int total1 = 0;
//        int total2 = 0;
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        for (int j = 0; j < n; j += 2) {
//            total1 += arr[j];
//        }
//        for (int k = 1; k < n; k += 2) {
//            total2 += arr[k];
//        }
//
//        System.out.println(Math.max(total1, total2));
//    }

    public static int[] d = new int[100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //다이나믹 - bottom up
        d[0] = arr[0];
        // 두 칸 건너뛸 수도 있어서 최댓값을 위해 Math.max 이용
        d[1] = Math.max(arr[0], arr[1]);
        for (int j = 2; j < n; j++) {
            //한 칸 이전의 값은 어차피 못 합하니까 j-1 그대로
            //건너뛴 값은 더할 수 있어서 더한 값
            //두개 값 비교해서 최대 값 저장
            d[j] = Math.max(d[j-1], d[j-2]+ arr[j]);
            //d[j-2]+arr[j] = 자신을 포함한 최댓값
            //d[j-1] = 자신을 포함하지 않은 최댓값이니까 이전의 값
        }

        System.out.println(d[n-1]);
    }
}
