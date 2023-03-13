package Chapter5_이진탐색;

import java.util.Scanner;

//이진탐색(반복문)
//시간 복잡도 : O(logN)
public class Algorithm_ChaeHyun_7_3 {

    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2; //소숫점 이하 버림
            //찾은 경우
            if(arr[mid] ==target) return mid;
            else if(arr[mid] > target)
                 end = mid - 1;
            else start = mid + 1;
        }
        return -1; // 찾지 못했을 경우
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int target = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = binarySearch(arr, target, 0, n -1);
        if (result == -1) {
            System.out.println("원소가 존재하지 않습니다");
        } else {
            System.out.println(result + 1);
        }
    }
}
