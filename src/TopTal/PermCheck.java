package TopTal;

import java.util.Arrays;

public class PermCheck {

    public static void main(String[] args) {

        int[] arreglo = {2};

      /*  int[] arreglo = new int[100000];
        for (int i=1;i< arreglo.length;i++)
            arreglo[i]=i;*/



        //int[] arreglo = {1, 3, 6, 4, 1, 2};  //5
        //int[] arreglo = {1, 2,3};  //4
        //int[] arreglo = {-1,-3}; // 1.

        int salida = solution(arreglo);
        System.out.println(salida);
    }

    public static int solution(int[] A) {
        int len = A.length;
        int min = 1;
        int  max =  1000000000;
        if (len>0 && len <= 100000) {
            for (int i = 0; i < A.length; i++) {
                if (A[i] > max && A[i] < min)
                    return 1;
            }

            Arrays.sort(A);
            min = 1;

            for (int i = 0; i < A.length; i++) {
                if (A[i] != min) {
                    return 0;
                }
                else
                    min++;
            }
            return 1;
        }
        return 0;
    }
}
