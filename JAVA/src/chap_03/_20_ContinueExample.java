package chap_03;

public class _20_ContinueExample {
    static void main() {
        for (int i =1; i<=10; i++){
            if (i%2 !=0){
                continue;
            }
            System.out.println(i + " ");
        }
    }
}
