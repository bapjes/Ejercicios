package TopTal;

import jStrings.ArrayList;
import jStrings.Empleado;

public class OddoccurrencyinArrays {
    public static void main(String[] args) {

    int[] A = {9,3,9,3,9,7,9};
    int output = solution(A);
    System.out.println(output);
    }

    public static int solution(int[] A)
    {
        int size = A.length;
        int odd=0;
        int value = 0;
        

        for (int i=0;i< size; i++) {
            value = A[i];
            if (value != 0) {
                odd= value;
                for (int j = i + 1; j < size; j++) {
                    if (value == A[j]) {
                        odd = -1;
                        A[i] = 0;
                        A[j] = 0;
                        break;
                    }
                }
            }
        }
        return odd;
    }
}
