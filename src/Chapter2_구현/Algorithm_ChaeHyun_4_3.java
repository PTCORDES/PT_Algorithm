package Chapter2_구현;

import java.util.Scanner;
//왕실의 나이트
public class Algorithm_ChaeHyun_4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        int x = n.charAt(1)-'0'; //1
        int y = n.charAt(0) - 'a' + 1;

        int total = 0;

        //이동할 수 있는 방향의 모든 조합
        int[] dx = {1, 1, -1, -1, -2, -2, 2, 2};
        int[] dy = {-2, 2, 2, -2, -1, 1, -1, 1};

        for (int i = 0; i < 8; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            //나이트 안에 있는지 확인
            if(nextX>=1 && nextX<=8 && nextY>=1 && nextY<=8)
                total++;
        }
        System.out.println(total);
    }
}
