package Chapter11_그리디문제;

import java.util.Scanner;

public class Algorithm_ChaeHyun_11_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] arr = new int[s.length()];
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i)-48;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= 1 || result <=1)
                result += arr[i];
            else
                result *= arr[i];
        }
        System.out.println(result);
    }

}
