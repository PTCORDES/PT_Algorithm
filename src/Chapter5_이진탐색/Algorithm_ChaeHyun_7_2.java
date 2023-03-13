package Chapter5_이진탐색;

import java.util.Scanner;

//이진 참색(재귀)
//정렬이 되어 있는 상태여야 한다
public class Algorithm_ChaeHyun_7_2 {

    public static int binarySearch(int[] arr, int target, int start, int end) {
        if(start > end) //해당 원소가 없는 경우
            return -1;
        int mid = (start + end) / 2; //소숫점 이하 버린다

        if(arr[mid] == target)
            return mid;
        else if (arr[mid] > target)
            //찾고자 하는 값 < 중간점 값
            return binarySearch(arr, target, start, mid - 1);
        else
            //찾고자 하는 값 > 중간점 값
            return binarySearch(arr, target, mid + 1, end);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int target = scanner.nextInt();

        //원소 입력 받기
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = binarySearch(arr, target, 0, n - 1);
        if (result == -1) {
            System.out.println("원소가 존재하지 않습니다");
        } else {
            System.out.println(result + 1);
        }
    }
}
