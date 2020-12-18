package TopTal;

import java.util.Arrays;

public class Triangle {

    public static void main(String[] args) {
       // int[] arreglo = {10,2,5,1,8,20};
        int[] arreglo = {10,50,5,1};


        int salida = solution(arreglo);


        System.out.println(salida);
    }


    public static int solution(int[] A) {


        int max = 2147483647;
        int min = -2147483648;

        if (A.length < 0 || A.length >100000)
            return 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > max || A[i] < min)
                return 0;
        }

        Arrays.sort(A);

        for(int i=0;i<A.length-2;i++){
            if(
                    ((long)A[i] + (long)A[i+1] > A[i+2]) &&
                            ((long)A[i+1] + (long)A[i+2] > A[i]) &&
                            ((long)A[i] + (long)A[i+2] > A[i+1])
            )
                return 1;
        }
        return 0;
    }
    }
