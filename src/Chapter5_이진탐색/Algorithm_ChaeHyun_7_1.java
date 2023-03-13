package Chapter5_이진탐색;

import java.util.Scanner;

//순차 탐색 - 앞에서부터 차례로 확인
//시간 복잡도 : O(N)
public class Algorithm_ChaeHyun_7_1 {
    //순차 탐색
    public static int sequentialSearch(int n, String target, String[] arr) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
            if (arr[i].equals(target)) {
                return i+1; //현재의 위치( 인덱스는 0부터 시작하므로)
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("생성할 원소 개수를 입력한 다음 한 칸 띄고 찾을 문자열을 입력하세요");

        //원소의 개수
        int n = scanner.nextInt();
        //찾고자 하는 문자열
        String target = scanner.next();

        System.out.println("앞서 적은 원소 개수만큼 문자열을 입력하세요! 구분은 띄어쓰기로 합니다.");
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next();
        }

        System.out.println(sequentialSearch(n, target, arr));
    }
}
