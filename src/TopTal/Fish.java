package TopTal;

import java.util.Arrays;
import java.util.Stack;

public class Fish {


    public static void main(String[] args) {
        int[] A = {4,3,2,1,5};
        int[] B = {0,0,0,0,0};
        int output = solution(A,B);
        System.out.println(output);

    }


    public static int solution(int[] A, int[] B) {
        int max = 1000000000;

        if (A.length < 1 || A.length > 100000)
            return 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > max || A[i] < 0) {
                return 0;
            }
        }

        for (int i = 0; i < B.length; i++) {
            if (B[i] > 1 || B[i] < 0) {
                return -1;
            }
        }

        int[] copy = new int[A.length];
        System.arraycopy(A,0,copy,0,A.length);

        Arrays.sort(copy);
        for(int i=0;i<A.length-1;i++){
            if(A[i]==A[i+1]){
                return 0;
            }
        }

        int count = 0;
        Stack< Integer > previousFishes = new Stack < Integer > ();
        for (int i = 0; i < A.length; i++) {
            int currentFish = A[i];
            int currentFlow = B[i];

            if (currentFlow == 1) {
                previousFishes.push(currentFish);
            }

            if (!previousFishes.empty() && currentFlow == 0) {
                while (!previousFishes.empty() && currentFish > previousFishes.peek()) {
                    int fish = previousFishes.pop();
                }
            }

            if (previousFishes.empty() && currentFlow == 0) {
                count++;
                            }

        }
        return count + previousFishes.size();

    }
}
