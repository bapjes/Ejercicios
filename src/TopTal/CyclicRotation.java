package TopTal;

import java.util.Arrays;

public class CyclicRotation {

    public static void main(String[] args) {
        int[] arreglo = {3,8,9,7,6};
        int k=3;

        int[] salida = solution(arreglo, k);
        System.out.println(Arrays.toString(salida));
        //for (int i=0;i<salida.length;i++)
            //System.out.println(salida[i]);
    }


    public static int[] solution(int[] A, int K)
    {

        int size = A.length-1;
        int i,j;
        int value = -1;
        //int[] rotation = new int[size];

        for (i=1;i<=K;i++) {
            value = A[size];
            for (j = size; j > 0; j--) {

                A[j] = A[j - 1];
            }
            A[0] = value;
        }
        return A;
    }
}
