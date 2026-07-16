package chap_02;

public class _06_InfinityAndNaNCheckExample {
    static void main() {
        int x = 5;
        double y = 0.0;
        double z = x/y;
        //double z = x % y; 잘못된 코드
        System.out.println(z + 2);

        //알맞는 코드
        if (Double.isInfinite(z) || Double.isNaN(z)) {
        }else {
            System.out.println(z + 2);
        }
    }
}
