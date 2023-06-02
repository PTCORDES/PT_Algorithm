package Chapter11_그리디문제;

import java.util.Arrays;
import java.util.Scanner;

public class Algorithm_ChaeHyun_11_4  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int min = 1;

        for (int j = 0; j < n; j++) {
            if (min < arr[j]) {
                break;
            }
            else
                min += arr[j]; //최소값
        }
        System.out.println(min);
    }
}
