package Chapter3_DFSBFS;

import java.util.LinkedList;
import java.util.Queue;

//큐
//선입선출
public class Algorithm_ChaeHyun_5_2 {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        //add() - 큐 맨 뒤에 값 삽입, 큐 꽉 찼을 때 illgalStateException발생
        //offer() - 값 추가 실패시 false, 성공 시 true
        q.offer(5);
        q.offer(2);
        q.offer(3);
        q.offer(7);
        //poll() - 큐 맨 앞에 있는 값 반환 후 삭제 , 비어 있을 때 null
        //remove() - 큐 맨 앞에 있는 값 반환 후 삭제 , 비어있을 때 noSuchElementException
        q.poll();
        q.offer(1);
        q.offer(4);
        q.poll();

        //clear() - 큐 비우기
        //peek() - 맨 앞에 있는 값 반환
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }
}
