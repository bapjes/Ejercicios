package TopTal;

import java.util.Arrays;

public class CountDiv {

    public static void main(String[] args) {

       int salida = solution(6,11,2);
        System.out.println(salida);
    }

    public static int solution(int A, int B, int K) {
        int b = (B/K) + 1;
        int a = (A/K) + 1;


        if (A>B || A <0 || A >2000000000)
            return 0;
        if (B <0 || B >2000000000)
            return 0;

        if (K <= 0 || B >2000000000)
            return 0;

        b = (B/K) + 1;
        a = (A/K) + 1;
        if (A%K == 0) {
            --a;
        }
        return b-a;

    }
}
