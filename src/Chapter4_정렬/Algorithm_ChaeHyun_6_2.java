package Chapter4_정렬;

public class Algorithm_ChaeHyun_6_2 {
    public static void main(String[] args) {
        int[] arr = {3, 5};

        //swap
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        System.out.println(arr[0] + " " + arr[1]);
    }
}