package Chapter11_그리디문제;

import java.util.Scanner;

public class Algorithm_ChaeHyun_11_6 {
    int count=0;
    int i = 0;
    public int solution(int[] food_times, int k){

        while (k != count) {
            if (food_times[i/3] != 0) {
                count++;
                food_times[i/3]--;
            }
            i++;
        }
        return i/3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = 
    }

}
