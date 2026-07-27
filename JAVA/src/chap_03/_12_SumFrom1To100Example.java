package chap_03;

public class _12_SumFrom1To100Example {
    public static void main(String[] args){
        int sum = 0;
        int i;

        for (i=1; i<=100; i++){
            sum +=1;
        }
        System.out.println("1~" + (i-1) + "합: " + sum);
    }
}
