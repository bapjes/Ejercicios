package TopTal;

public class MaxCounters {




    public static void main(String[] args) {
        int[] arreglo = {3,4,4,6,1,4,4};
        int k=5;

        int[] salida = solution(k,arreglo);

        for (int i=0;i<salida.length;i++)
            System.out.println(salida[i]);
    }


    public static int[] solution(int N, int[] A) {

        int counterPosition=0;
        int greaterValueInCounter = 0;

        int n= A.length;
        if (n > 0 && N > 0 && n <= 100000 && N <= 100000) {
            int[] counters = new int[N];
        for (int i = 0; i <n; i++) {
            if (A[i] <= 0 || A[i] > N+1) {
                 return (new int[0]);
            }
        }


            for (int k = 0; k < A.length; k++) {
                if (A[k] <= N) {
                    counterPosition = A[k];
                    counterPosition--;
                    counters[counterPosition]++;
                    if (counters[counterPosition] > greaterValueInCounter)
                        greaterValueInCounter = counters[counterPosition];
                } else {
                    for (int i = 0; i < N; i++)
                        counters[i] = greaterValueInCounter;
                }
            }
            return counters;
        }
        return new int[0];
    }

   }
