package Chapter2_구현;

import java.util.Scanner;

//상하좌우
//다시 풀어보기
public class Algorithm_ChaeHyun_4_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); //버퍼 비우기
        //윗 줄에서 입력을 한번 받았기 때문에 공백을 인식할 수 있어서 비워줘야 함

        int a = 1;
        int b = 1;

        String[] array = sc.nextLine().split(" ");

        //풀이1 - 직관적인 버전
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("L")) {
                b--;
                if (a < 1 || a > n || b < 1 || b > n) {
                    b++;
                }
                System.out.println(a + " " + b);
            } else if (array[i].equals("R")) {
                b++;
                if (a < 1 || a > n || b < 1 || b > n) {
                    b--;
                }
                System.out.println(a + " " + b);
            } else if (array[i].equals("U")) {
                a--;
                if (a < 1 || a > n || b < 1 || b > n) {
                    a++;
                }
                System.out.println(a + " " + b);
            } else if (array[i].equals("D")) {
                a++;
                if (a < 1 || a > n || b < 1 || b > n) {
                    a--;
                }
                System.out.println(a + " " + b);
            }
        }

        //풀이2 - 좀 더 간결한 버전
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] moveTypes = {'L', 'R', 'U', 'D'};

        for (int i = 0; i < array.length; i++) {
            char plan = array[i].charAt(0);

            int tempX = -1, tempY = -1; //값이 벗어나는지 확인하기 위함
            for (int j = 0; j < 4; j++) {
                if (plan == moveTypes[j]) {
                    tempX = a + dx[j];
                    tempY = b + dy[j];
                }
            }

            // 공간을 벗어나는 경우 무시
            if (tempX < 1 || tempY < 1 || tempX > n || tempY > n)
                continue;
            // 공간을 벗어나지 않는 경우에만 실제 좌표에 이동 수행
            a = tempX;
            b = tempY;
        }
        System.out.println(a + " " + b);
    }
}
