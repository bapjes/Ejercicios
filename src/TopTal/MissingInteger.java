package TopTal;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingInteger {

    public static void main(String[] args) {
        int[] arreglo = new int[1000];
        for (int i=1;i< arreglo.length;i++)
            arreglo[i]=i;

        arreglo[0] = -1;

        //int[] arreglo = {1, 3, 6, 4, 1, 2};  //5
        //int[] arreglo = {1, 2,3};  //4
        //int[] arreglo = {-1,-3}; // 1.

        int salida = solution(arreglo);
        System.out.println(salida);
    }

    public static int solution(int[] A) {
        int len = A.length;
        int min = -1000000;
        int  max =  1000000;
        if (len>0 && len <= 100000) {
            for (int i = 0; i < A.length; i++) {
                if (A[i] > max && A[i] < min)
                    return 1;
            }

                Arrays.sort(A);
                min = 1;
                if (A[A.length-1] < 0)
                    return 1;

                for (int i = 0; i < A.length; i++) {
                    if (A[i] == min) {
                        min++;
                    }
                }
                return min;

        }
        return 1;
    }
    }
