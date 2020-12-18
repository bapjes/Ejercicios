package TopTal;

import java.util.Arrays;

public class GenomicRangeQuery {

    public static void main(String[] args) {

        int[] P = {2,5,0};
        int[] Q = {4,5,6};
        String S = "CAGCCTA";

        int[] output = solution(S,P,Q);
        System.out.println(Arrays.toString(output));
     /*   for (int i=0;i<output.length;i++)
            System.out.println(output[i]);*/


    }

    public static int[] solution(String S, int[] P, int[] Q) {

        String sUpper = S.toUpperCase();
        //char c[] = sUpper.toCharArray();
        int answer[] = new int[P.length];
        int tempAnswer;
        char tempC;

        if (S.length() <=0 || S.length() > 100000)
            return (new int[0]);

        for (int i=0;i<P.length;i++)
        {
            if (P[i] > Q[i])
                return (new int[0]);
        }


        int[][] genoms = new int[3][S.length()+1];
        //if the char is found in the index i, then we set it to be 1 else they are 0
        // 3 short values are needed for this reason
        int a, c, g;
        for (int i=0; i<sUpper.length(); i++) {
            a = 0; c = 0; g = 0;
            if ('A' == (sUpper.charAt(i))) {
                a=1;
            }
            if ('C' == (sUpper.charAt(i))) {
                c=1;
            }
            if ('G' == (sUpper.charAt(i))) {
                g=1;
            }

            genoms[0][i+1] = genoms[0][i] + a;
            genoms[1][i+1] = genoms[1][i] + c;
            genoms[2][i+1] = genoms[2][i] + g;
        }

        int[] result = new int[P.length];

        for (int i=0; i<P.length; i++) {
            int fromIndex = P[i]+1;
            int toIndex = Q[i]+1;

            if (genoms[0][toIndex] - genoms[0][fromIndex-1] > 0) {
                result[i] = 1;
            } else if (genoms[1][toIndex] - genoms[1][fromIndex-1] > 0) {
                result[i] = 2;
            } else if (genoms[2][toIndex] - genoms[2][fromIndex-1] > 0) {
                result[i] = 3;
            } else {
                result[i] = 4;
            }
        }

        return result;
    }
}
