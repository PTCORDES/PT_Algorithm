package Chapter11_그리디문제;

import java.util.Scanner;

public class Algorithm_ChaeHyun_11_3 {
    public static int count0 = 0;
    public static int count1 = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        if (a.charAt(0) == '1') {
            count0 += 1;
        }
        else {
            count1 += 1;
        }

        for (int i = 0; i < a.length() - 1; i++) {
            if (a.charAt(i) != a.charAt(i + 1)) {
                if (a.charAt(i + 1) == '1') count0 += 1;
                else count1 += 1;
            }
        }

        System.out.println(Math.min(count0, count1));
    }
}
