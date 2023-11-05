package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백만장자
public class swea_1859 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer st;

        for (int i = 1; i <= T; i++) {
            int n = Integer.parseInt(bufferedReader.readLine());
            int[] a = new int[n];
            st = new StringTokenizer(bufferedReader.readLine());

            for (int j = 0; j < n; j++) {
                a[j] = Integer.parseInt(st.nextToken());
            }

            int max =0;
            long ans = 0; //long으로 해야함
            for (int k = n - 1; k >= 0; k--) {
                if (max > a[k]) {
                    ans += max - a[k];
                }else{
                    max = a[k];
                }
            }
            System.out.println("#"+ i+" "+ ans);
        }

    }

}
