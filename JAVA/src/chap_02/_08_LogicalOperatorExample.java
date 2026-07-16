package chap_02;

public class _08_LogicalOperatorExample {
    static void main() {
        /*
        and && 또는 & 피연산자 모두가 true일 경우에만 연산 결과가 true
        or  || 또는 | 피연산자 중 하나만 true이면 연산 결과는 true
        XOR ^        피연산자가 하나는 true이고 다른 하나가 false 일 경우에만 연산 결과가 true
        NOT |        피연산자의 논리값을 바꿈
        */



        int charCode = 'A';
        //int charCode = 'a';
        //int charCode = '5';

        if ( (65<=charCode) & (charCode<=90) ) {
            System.out.println("대문자이군요.");
        }

        if ( (97<=charCode) && (charCode<122) ) {
            System.out.println("소문자이군요.");
        }

        if ( (48<=charCode) && (charCode<=57) ) {
            System.out.println("0~9 숫자이군요.");
        }

        //-------------------------------------------------------------------

        int value = 6;
        //int value = 7;

        if ( (value%2==0) | (value%3==0) ) {
            System.out.println("2 또는 3의 배수이군요.");
        }

        boolean result = (value%2==0) || (value%3==0);
        if (!result) {
            System.out.println("2 또는 3의 배수가 아니군요.");
        }
    }
}
