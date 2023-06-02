package Chapter11_그리디문제;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Algorithm_ChaeHyun_11_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        int count = 0;
        int groupCnt = 0;

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        //정렬
        Collections.sort(arr);

        for (int i = 0; i < n; i++) {
            count += 1;
            if (count >= arr.get(i)) { //그룹에 포함된 모험가 수 >= 공포도 -> 그룹 결성
                groupCnt += 1;
                count = 0;
            }
        }

        System.out.println(groupCnt);
    }
}
