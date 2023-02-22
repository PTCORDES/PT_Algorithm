package Chapter2_구현;

import java.util.Scanner;

//시각
public class Algorithm_ChaeHyun_4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;

        //풀이1 - matches 함수 활용
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    String tempk = Integer.toString(k);
                    String tempj = Integer.toString(j);
                    String tempi = Integer.toString(i);
                    String result = tempk + tempj + tempi;
                    if(result.matches("(.*)3(.*)"))
                        total++;
                }
            }
        }

        //풀이2 - 직접 찾는 방법 (좀 더 이상적)
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    if (i % 10 == 3 || j % 10 == 3 || j / 10 == 3 || k % 10 == 3 || k / 10 == 3) {
                        total++;
                    }
                }
            }
        }
        System.out.println(total);
    }
}
