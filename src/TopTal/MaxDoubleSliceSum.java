package TopTal;

public class MaxDoubleSliceSum {

    public static void main(String[] args) {
        int[] A = {3,2,6,-1,4,5,-1,2};
        //int[] A = {2147483647};
        int output = solution(A);
        System.out.println(output);

    }


    public static int solution(int[] A) {
        int i;
        if (A.length < 3 || A.length > 100000)
            return -1;

        for (i = 0; i < A.length; i++) {
            if (A[i] > 10000 || A[i] < -10000)
                return -1;
            }

            int n = A.length;

            int[] maxLeftSum = new int[n];
            for (i = 1; i < n - 1; i++) {
                maxLeftSum[i] = Math.max(maxLeftSum[i - 1] + A[i], 0);
            }

            int[] maxRightSum = new int[n];
            for (i = n - 2; i > 0; i--) {
                maxRightSum[i] = Math.max(maxRightSum[i + 1] + A[i], 0);
            }

            int max_slice = 0;
            for (i = 1; i < n - 1; i++) {
                max_slice = Math.max(max_slice, maxLeftSum[i - 1] + maxRightSum[i + 1]);
            }
            return max_slice;
        }

  }
