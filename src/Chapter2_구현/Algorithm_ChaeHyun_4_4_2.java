package Chapter2_구현;

import java.util.Scanner;

public class Algorithm_ChaeHyun_4_4_2 {

    public static int n, m;
    public static int a, b, direction;
    public static int[][] d = new int[50][50]; //방문했는지
    public static int[][] array = new int[50][50]; //바다인지

    public static int dx[] = {-1, 0, 1, 0};
    public static int dy[] = {0, 1, 0, -1};
    public static void turn_left(){
        direction -= 1;
        if(direction==-1)
            direction=3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        a = sc.nextInt();
        b = sc.nextInt();
        direction = sc.nextInt();
        d[a][b] = 1;
        int count = 0;
        int turn_time = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; i < m; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        while (true) {
            turn_left();
            int nx = a + dx[direction];
            int ny = b + dy[direction];
            if (d[nx][ny] == 0 && array[nx][ny] == 0) {
                a = nx;
                b = ny;
                turn_time = 0;
                count++;
                continue;
            } else {
                turn_time++;
                if (turn_time == 4) {
                    nx = a - dx[direction];
                    ny = b - dy[direction];
                    if (array[nx][ny] == 0) {
                        a= nx;
                        b= nx;
                    }
                    else break;
                    turn_time=0;
                }

            }
        }
        System.out.println(count);
    }
}
