package chap_01;

public class _05_CharExample {
    static void main() {
        /* char var1 = 'A';  'A' 문자와 매핑되는 숫자: 65로 대입
        char var3 = '가'   '가' 문자와 매핑되는 숫자: 446032로 대입

        유니코드가 정수이므로 char 타입도 정수 타입에 속한다. 그렇기 때문에 char 변수에 작은 따옴표로 감싼 문자가 아니라 유니코드 숫자를 직접 대입할 수 있다.
        char c = 65;   10진수 65와 매핑되는 문자: 'A'
        char c = 0x0041;   16진수 0x0041과 매핑되는 문자: 'A' */

        char c1 = 'A'; //문자 저장
        char c2 = 65; //유니코드 직접 저장

        char c3 = '가'; //문자 저장
        char c4 = 44032; //유니코드 직접 저장

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        /*char 타입의 변수에 어떤 문자도 대입하지 않고 단순히 초기화를 할 목적으로 다음과 같이 작은 따옴표(') 두 개를 연달아 붙인 빈 (empty) 문자를 대입하면
        컴파일 에러가 발생한다. 이 경우에는 공백 (유니코드:32) 하나를 포함해서 초기화 해야한다.
         char c = ''; 컴파일 에러
         char c = ' '; 공백 하나를 포함해서 초기화 */


    }
}
