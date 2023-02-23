package Chapter1_그리디;


//그리디 알고리즘 - 현재 상황에서 가장 좋은 것만 고르는 방법
public class Algorithm_ChaeHyun_3_1 {

/*
         예제 3-1 거스름돈
         전체: 큰 단위가 작은 단위의 배수 형태일 때
         손님에게 거슬러 줘야 할 돈이 n원일 때 거슬러 줘야 할 동전의 최소 개수
         가장 큰 화폐 단위부터 돈을 거슬러 주는 것
         시간 복잡도 : 동전의 총 종류 ( 거슬러 줘야 하는 금액의 크기와는 무관)
 */
    public static void main(String[] args) {
        int a = 1260;
        int total = 0;
        int[] coinTypes = {500, 100, 50, 10};


        for (int i = 0; i < coinTypes.length; i++) {
            int coin = coinTypes[i]; //동전의 종류
            total += a/coin; //거슬러 줘야 할 동전의 총 개수
            a %= coin; //거슬러 주고 남은 금액
        }
        System.out.println(total);
    }

/*
    public static void main(String[] args) {
        int a = 1260;
        int total = 0;
        int[] coin = {500, 100, 50, 10};

         int num = 0;

        for (int i = 0; i < coin.length; i++) {
            num = a/coin[i];
            total = total+=num;
            a = a - (coin[i] * num);
        }
        System.out.println(total);
      }


        ' n %= a'  : n을 a로 나누고 나머지 값을 n에 대입
        이 문법 까먹어서 위 코드처럼 num이라는 변수를 하나 더 만들었다
        변수 이름도 수정(coin-> coinTypes)
        위는 수정한 완성본
   */


}
