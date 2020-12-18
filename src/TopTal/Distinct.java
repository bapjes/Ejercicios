package TopTal;

import java.util.Arrays;

public class Distinct {

    public static void main(String[] args) {
        int[] arreglo = {};
        int k=5;

        int salida = solution(k,arreglo);


            System.out.println(salida);
    }


    public static int solution(int N, int[] A) {
        Arrays.sort(A);

        int count = 1;


        int max = 1000000;
        int min =-1000000;

        if (A.length<0)
            return 0 ;
        if (A.length==0)
            return 1;
        for (int i=0;i<A.length;i++) {
            if (A[i] > max || A[i] < min )
                return 0;
        }

        for (int i=1;i<A.length;i++)
        {
            if (A[i-1] != A[i])
                count++;
        }
        return count;
    }
}
