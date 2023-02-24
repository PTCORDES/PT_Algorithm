package Chapter1_그리디;

import java.util.Arrays;
import java.util.Scanner;

public class Algorithm_ChaeHyun_3_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int top = 0;

        //풀이1
        //한 줄씩 배열에 담아 정렬한 후 가장 작은 값 비교
        for (int i = 0; i < n; i++) {
            int[] arr1 = new int[m];
            for (int j = 0; j < m; j++) {
                 arr1[j] = scanner.nextInt();
            }

            Arrays.sort(arr1); //정렬
            if (arr1[0] > top) {
                top = arr1[0];
            }
        }

        //풀이2 - 책 해설
        for (int i = 0; i < n; i++) {
            int min_value = 10001; //가장 작은 값 비교 위한 가장 큰 수
            for (int j = 0; j < m; j++) {
                int x = scanner.nextInt();
                min_value = Math.min(min_value, x); //min_value 값과 비교해 더 작은 값을 min_value로
            }
            //가장 작은 수들 중에서 가장 큰 수 찾기
            top = Math.max(top, min_value);
        }

        System.out.println(top);
    }
}
