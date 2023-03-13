package Chapter5_이진탐색;

import java.util.HashSet;
import java.util.Scanner;

//집합 set으로 확인 - Hashset
//특정한 수가 한 번이라도 등장했는지를 검사하면 된다
//집합 자료형 이용해 문제 해결
//중복 값 허용x, 입력한 순서 보장x, null값 허용 -> 값의 존재 유무 파악할 때 유용
public class Algorithm_ChaeHyun_7_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //집합(set) 정보를 처리하기 위한 라이브러리
        HashSet<Integer> s = new HashSet<>();

        //n
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            s.add(x);
        }

        //m
        int m = sc.nextInt();
        int[] targets = new int[n];
        for (int i = 0; i < m; i++) {
            targets[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            if (s.contains(targets[i])) {
                System.out.print("Yes ");
            } else {
                System.out.print("no ");
            }
        }
    }
}
