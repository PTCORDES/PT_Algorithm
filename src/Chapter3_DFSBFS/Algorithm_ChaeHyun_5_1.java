package Chapter3_DFSBFS;

import java.util.Stack;

//스택
//선입후출
public class Algorithm_ChaeHyun_5_1 {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(5);
        s.push(2);
        s.push(3);
        s.push(7);
        s.pop(); //top에 있는 item삭제, 해당 item 반환
        s.push(1);
        s.push(4);
        s.pop(); //가장 위쪽 원소 꺼내기(삭제)

        while (!s.empty()) {
            System.out.println(s.peek()); //top에 있는 item 반환 - 최상단부터 반환
            s.pop();
        }
    }
}
