package Chapter4_정렬;

//선택 정렬 - 하나하나 인덱스 다 비교 후 작으면 인덱스 swap
//가장 작은 원소와 n번째 원소 swap
public class Algorithm_ChaeHyun_6_1 {
    public static void main(String[] args) {

        int n = 10;
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        for (int i = 0; i < n; i++) {
            int min_index = i; //가장 작은 원소의 인덱스
            for (int j = i + 1; j < n; j++) {
                if (arr[min_index] > arr[j]) {
                    min_index = j; //비교한 원소가 더 작으면 인덱스 바꾸기
                }
            }
            //스와프
            int temp = arr[i]; // 0번쩨 원소
            arr[i] = arr[min_index]; //0번째 원소를 가장 작은 원소와 바꾼다
            arr[min_index] = temp; //가장 작은 원소와 0번째 원소 바꾼다
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
