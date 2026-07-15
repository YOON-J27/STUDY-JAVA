package chap_01;

public class _01_Variable {
    static void main() {
        //변수 value 선언
        //int value;

        //연산 결과를 변수 result의 초기값으로 대입
        //int result = value +10;

        // 변수 result 값을 읽고 콘솔에 출력
        // System.out.println(result);//

        int hour = 3;
        int minute = 5;
        System.out.println(hour + "시간 " +minute+ "분");

        int totalMinute =  (hour*60) + minute;
        System.out.println("총" + totalMinute + "분");

        //-------------------------------------------------

        // 변수는 또 다른 변수에 대입되어 메모리 간에 값을 복사할 수 있다 다음 코드는 변수 x 값을 변수 y 값으로 복사한다.
        // int x = 10; 변수 x에 10을 대입
        // int y = x; 변수 y에 변수 x 값을 대입

        int x = 3;
        int y = 5;
        System.out.println("x:"+x+ ",y:" + y);

        int temp = x;
        x = y;
        y = temp;
        System.out.println("x:"+x+ ",y:" +y);
    }
}