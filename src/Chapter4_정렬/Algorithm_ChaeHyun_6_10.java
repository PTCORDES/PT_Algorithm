package Chapter4_정렬;

import java.util.Arrays;
import java.util.Scanner;

public class Algorithm_ChaeHyun_6_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);

        //풀이2
        //Arrays.sort(arr, Collections.reverseOrder());

        for (int j = n - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }
    }
}
