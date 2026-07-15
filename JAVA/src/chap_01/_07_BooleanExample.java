package chap_01;

public class _07_BooleanExample {
    static void main() {
        /* 참과 거짓을 의미하는 논리 리터널은 true와 false이다. 논리 리터럴은 boolean 타입 변수에 다음과 같이 대입할 수 있다.
        boolean stop = true;
        boolean stop = false;
        boolean 타입 변수는 주로 두 가지 상태값을 저장할 필요가 있을 경우에 사용되며, 상태값에 따라 조건문과 제어문의 실행 흐름을 변경하는데 사용된다.
        연산식 중에서 비교 및 논리 연산의 산출값은 true 또는 false이므로 boolean 타입 변수에 다음과 같이 대입할 수 있다.
        int x = 10;
        boolean result = (x ==20); 변수 x의 값이 20인가?
        boolean result = (x != 20); 변수 x의 값이 20이 아닌가?
        boolean result = (x > 20); 변수 x의 값이 20보다 큰가?
        boolean result = (0 < x && x < 20); 변수 x의 값이 0보다 크고, 20보다 적은가?
        boolean result = (x < 0 || x > 200); 변수 x의 값이 0보다 적거나 200보다 큰가?
        */

        boolean stop = true;
        if (stop) {
            System.out.println("중지합니다.");
        } else {
            System.out.println("시작합니다.");
        }
        int x = 10;
        boolean result1 = (x == 20); //변수 x의 값이 20인가?
        boolean result2 = (x != 20); //변수 x의 값이 20이 아닌가?
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
    }
}
