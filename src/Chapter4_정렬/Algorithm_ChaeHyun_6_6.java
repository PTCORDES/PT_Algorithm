package Chapter4_정렬;

//계수 정렬
//특정한 조건 부합할 때만 사용할 수 있지만 매우 빠르다
//모든 데이터의 범위가 모두 담길 수 있도록 하나의 리스트 만들어야 함
public class Algorithm_ChaeHyun_6_6 {

    public static final int MAX_VALUE = 9;

    public static void main(String[] args) {
        int n= 15;

        //모든 원소의 값이 0보다 크거나 같다고 가정
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};
        int[] cnt = new int[MAX_VALUE + 1]; //모든 범위를 포함하는 배열

        for (int i = 0; i < n; i++) {
            cnt[arr[i]] +=1;
        }

        for (int i = 0; i <= MAX_VALUE; i++) {
            for (int j = 0; j < cnt[i]; j++) {
                System.out.print(i + " "); //등장한 횟수만큼 인덱스 출력
            }
        }
    }
}
