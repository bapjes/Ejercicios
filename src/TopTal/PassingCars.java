package TopTal;

import com.sun.deploy.security.SelectableSecurityManager;

public class PassingCars {

    public static void main(String[] args) {
        int[] arreglo = {0,2,0,1,1};


       int salida = solution(arreglo);
        System.out.println(salida);
    }

    public static int solution(int[] A)
    {
        int countOfZeros = 0;
        int count = 0;
        boolean  flag = true;

        int len = A.length;
        if (len < 0  || len > 100000)
            return -1;

        for (int i=0;i<len ; i++)
        {
            if (A[i] > 0 && A[i] > 1)
            {
                flag = false;
                break;

            }
        }

        if (flag) {
            for (int i = 0; i < len; i++) {
                if (A[i] == 0) countOfZeros++;
                if (A[i] == 1) count += countOfZeros;
                if (count > 1000000000) return -1;

            }
            return count;
        }
        else
            return -1;
    }
}
