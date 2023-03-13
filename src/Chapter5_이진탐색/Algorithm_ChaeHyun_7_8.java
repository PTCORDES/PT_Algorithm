package Chapter5_이진탐색;

import java.util.Scanner;

//피라메트릭 서치 ( 이진 탐색 )
//최적화 문제 (떡의 길이)
public class Algorithm_ChaeHyun_7_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //떡의 개수
        int m = sc.nextInt(); //요청한 떡의 길이

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end = (int) 1e9; //무한대 값

        int result = 0;
        while (start <= end) {
            long total = 0;
            //mid = 떡의 높이
            int mid = (start+end) /2;
            for (int i = 0; i < n; i++) {
                //잘랐을 때 떡의 양 계산
                if(arr[i] > mid) total += arr[i] - mid;
            }
            if (total < m) { //떡의 양이 적을 땐 더 많이 잘라야 하니 (왼쪽 탐색)
                end = mid - 1;
            } else {
                result = mid; //떡의 양이 충분한 경우 덜 잘라야 함(오른족 탐색)
                start = mid + 1; //최대한 덜 잘랐을 때가 정답이므로, result에 mid(높이) 저장
            }
        }
        System.out.println(result);
    }
}
