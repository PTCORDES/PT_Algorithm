package Chapter1_그리디;

import java.util.Arrays;
import java.util.Scanner;

//큰 수의 법칙
//n : 배열의 개수 (자연수의 개수) m : 더하는 횟수 k : 연속해서 더해질 수 있는 횟수
public class Algorithm_ChaeHyun_3_2 {

    public static void main(String[] args) {
        //가장 큰 수와 두번째로 큰 수만 저장하면 된다
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }


        Arrays.sort(array); //정렬 - 작은 순서부터 정렬
        int first = array[n-1]; //가장 큰 수
        int second = array[n-2]; //가장 작은 수

        //가장 큰 수가 더해지는 횟수 계산
        //가장 큰 수를 k번 더하고 두번째로 큰 수를 1번 더하는 연산
        // k+1 묶어서 생각 (가장 큰 수 * k + 두번째로 큰 수)
        int total = m/(k+1) * k;
        total += m % (k+1); //덩어리를 제외한 가장 큰 수의 개수

        int result = 0;
        result += total * first;
        result += (m - total) * second; //총 개수에서 가장 큰 수의 개수를 뺀 나머지 = 두번째로 큰 수의 개수

        System.out.println(result);
    }
}
