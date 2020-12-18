package TopTal;

public class TapeEquilibrium {
    public static void main(String[] args) {
        int[] A = {3,1,2,4,3};
        //int[] A = {-2,-1,1,2};
        int output = solution(A);
        System.out.println(output);

    }

    public static int solution(int[] A)
    {
        int n = A.length;
        int sum1,sum2,lower,calculation;

        if (A.length <2 || A.length > 100000)
            return (0);

        for (int i = 0; i <A.length; i++) {
            if (A[i] > 10000 || A[i] < -10000) {
                return 0;
            }
        }
        int minimum = A.length*1000;
        int head = 0;
        int tail = 0;
        for (int i = 0; i<A.length; i++) tail+= A[i];
        for(int i = 0; i<A.length-1; i++){
            head+= A[i];
            tail-= A[i];
            if (minimum>Math.abs(head-tail)) minimum = Math.abs(head-tail);
        }
        return minimum;

            }

}
