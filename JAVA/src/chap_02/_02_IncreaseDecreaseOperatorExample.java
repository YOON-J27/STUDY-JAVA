package chap_02;

public class _02_IncreaseDecreaseOperatorExample {
    static void main() {
        /*
        연산식
        ++ 피연산자 피연산자의 값을 1 증가시킴
        -- 피연산자 피연산자의 값을 1 감소시킴
        피연산자 ++ 다른 연산을 수행한 후에 피연산자의 값을 1 증가시킴
        피연산자 -- 다른 연산을 수행한 후에 피 연산자의 값을 1 감소시킴
        */

        int x = 10;
        int y = 10;
        int z;

        x++;
        y++;
        System.out.println("x=" + x);

        System.out.println("--------------------------");
        y--;
        --y;
        System.out.println("y=" +y);

        System.out.println("--------------------------");
        z = x++;
        System.out.println("z=" +z);
        System.out.println("x=" +x);

        System.out.println("--------------------------");
        z = ++x;
        System.out.println("z=" +z);
        System.out.println("x=" +x);

        System.out.println("--------------------------");
        z = ++x + y++;
        System.out.println("z=" +z);
        System.out.println("x=" +x);
        System.out.println("y=" +y);

    }
}
