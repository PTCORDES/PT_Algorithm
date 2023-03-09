package Chapter4_정렬;

//Quick Sort
//첫번째 위치한 숫자를 피벗으로 지정
//피벗을 기준으로 왼쪽에서는 자신보다 큰 데이터, 오른쪽에서는 자신보다 작은 데이터를 만나면 swap
//엇갈렸을 때는 작은 데이터(오른쪽에서 선택된 데이터)와 피벗 swap
//위 과정 재귀적으로 수행
public class Algorithm_ChaeHyun_6_4 {

    public static void quickSort(int[] arr, int start, int end) {
        if(start>=end)
            return;
        int pivot = start;
        int left = start + 1;
        int right = end;
        while (left <= right) {
            //pivot보다 큰 데이터를 찾을 때까지 반복
            //pivot보다 작다면 한칸씩 이동하며 반복
            while (left <= end && arr[left] <= arr[pivot]){
                System.out.println("left " + left);
                left++;
            }
            //pivot보다 작은 데이터를 찾을 때까지 반복
            while (right > start && arr[right] >= arr[pivot]){
                System.out.println("right " + right);
                right--; //정렬이 되어 있을 경우 right 이 계속 줄어들다가 right=0
            }

            if (left > right) { //엇갈렸다면 작은 데이터와 pivot 교체
                int temp = arr[pivot];
                arr[pivot] = arr[right]; //작은 데이터 = 오른쪽에서 찾은 값
                arr[right] = temp;
                System.out.println(pivot);
            }

            //엇갈리지 않았다면 작은 데이터 <-> 큰데이터
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        //분할 이후 왼쪽, 오른쪽 부분 각각 재귀적으로 정렬 수행
        quickSort(arr, start, right - 1);
        quickSort(arr, right+1, end);
    }
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {0,1,2,3,4,5,6,7,8,9};

        quickSort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
