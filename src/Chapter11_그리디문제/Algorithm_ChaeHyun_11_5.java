package Chapter11_그리디문제;

import java.util.Scanner;

public class Algorithm_ChaeHyun_11_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        int answer = 0;

        //풀이 1
//        for (int i = 0; i < N; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (int i = 0; i < N; i++) {
//            for (int j = i + 1; j < N; j++) {
//                if(arr[i]!=arr[j])
//                    answer++;
//            }
//        }

        //풀이2 - 그리디 방식
        //하나를 선택하고 최소가 되는 방식
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            arr[x] +=1;
        }

        for (int i = 1; i <= M; i++) {
            N -= arr[i]; // 같은 무게 선택하는 경우 제외
            answer += arr[i] * N;
        }
        System.out.println(answer);
    }
}
