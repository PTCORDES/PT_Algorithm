package Chapter5_이진탐색;

import java.util.Scanner;

public class Algorithm_ChaeHyun_7_5 {

    //풀이1 - 순차 탐색
    public static int binarySearch(int n, int[] arr, int target) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        String[] arr2 = new String[m];
        for (int j = 0; j < m; j++) {
            int result = binarySearch(n, arr1, sc.nextInt());
            if (result == 1) {
                arr2[j] = "Yes";
            } else arr2[j] = "No";
        }
        for (String p : arr2) {
            System.out.print(p + " ");
        }
    }

    //풀이2 - 반복문
//    public static int binarySearch(int[] arr, int target, int start, int end) {
//        while (start <= end) {
//            int mid = (start + end) / 2;
//            if(arr[mid] ==target) return mid;
//            else if(arr[mid]<target)
//                end = mid -1;
//            else
//                start = mid + 1;
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // N(가게의 부품 개수)
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        // 이진 탐색을 수행하기 위해 사전에 정렬 수행
//        Arrays.sort(arr);
//
//        // M(손님이 확인 요청한 부품 개수)
//        int m = sc.nextInt();
//        int[] targets = new int[m];
//        for (int i = 0; i < m; i++) {
//            targets[i] = sc.nextInt();
//        }
//
//        // 손님이 확인 요청한 부품 번호를 하나씩 확인
//        for (int i = 0; i < m; i++) {
//            // 해당 부품이 존재하는지 확인
//            int result = binarySearch(arr, targets[i], 0, n - 1);
//            if (result != -1) {
//                System.out.print("yes ");
//            }
//            else {
//                System.out.print("no ");
//            }
//        }
//    }
//    }
}
