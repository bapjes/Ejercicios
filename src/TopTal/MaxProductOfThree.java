package TopTal;

import java.util.Arrays;

public class MaxProductOfThree {
    public static void main(String[] args) {


        int[] list = {4,2,2,5,1,5,8};
        int output = solution(list);
        System.out.println(output);
    }

    public static int  solution(int A[]) {

        if (A.length<3 || A.length>100000)
            return 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > 10000 || A[i] < -10000) {
                return 0;
            }
        }


        Arrays.sort(A);
        int n = A.length;
        return Math.max(
                A[0] * A[1] * A[n - 1],
                A[n - 3] * A[n - 2] * A[n - 1]
        );

        }

}
