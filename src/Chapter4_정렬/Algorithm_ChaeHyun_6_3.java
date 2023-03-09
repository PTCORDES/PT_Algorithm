package Chapter4_정렬;

//삽입 정렬 - 자신보다 작은 값을 만났을 때 그 위치에 삽입
//큰 값 만나면 swap
//오름차순 되어있으면 효울이 좋다
public class Algorithm_ChaeHyun_6_3 {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) { //자신보다 큰 값 만나면
                    //swap
                    //큰 값 만나면 한칸씩 바꾸고 바꿔서 삽입됨
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j-1] = temp;
                }
                //자기보다 작은 데이터를 만나면 그 위치에서 멈춤
                else break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
