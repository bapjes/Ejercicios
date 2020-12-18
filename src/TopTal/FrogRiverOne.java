package TopTal;

public class FrogRiverOne {
    public static void main(String[] args) {
        int[] arreglo = {1,3,1,4,2,3,5,4};
        int k=3;

        //int salida = solution(5,arreglo);
        int salida = solution(5,arreglo);
        System.out.println(salida);
    }

    public static int solution(int X, int[] A)
    {

        boolean[] leavesAsSteps = new boolean[X + 1];
        int espectedSum = 0, correctSum = 0;
        int n = 0;
        boolean flag = true;
        n= A.length;
        for (int i = 0; i <n; i++) {
            if (A[i] <= 0 || A[i] > X) {
                flag = false;
                break;
            }
        }

        if (flag)
        {
            if (n > 0 && X > 0 && n <= 100000 && X <= 100000) {
                for (int i = 1; i <= n; i++) {
                    if (i <= X)
                        //get summatory of 1..N
                        correctSum += i;
                    if (A[i - 1] <= X &&
                            !leavesAsSteps[A[i - 1]]) {
                        //accumulate where the expected leaf fell and set its location to true
                        espectedSum += A[i - 1];
                        leavesAsSteps[A[i - 1]] = true;
                    }
                    if (espectedSum == correctSum && i >= X)
                        //if all the espected leaves fell, then return the array's
                        //index where the last expected leaf was found
                        return i - 1;
                }
            }
        }
        return -1;
    }
}
