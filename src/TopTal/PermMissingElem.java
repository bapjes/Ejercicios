package TopTal;

public class PermMissingElem {

    public static void main(String[] args) {
        int[] A = {2,3,1,5};
        int output = solution(A);
        System.out.println(output);

    }

   public static int solution(int[] A)
    {
        int maximumNumber = A.length + 1;
        if (maximumNumber > 0 && maximumNumber <= 100001) {
            int totalSum = (maximumNumber * (maximumNumber + 1)) / 2;
            int partialSum = 0;
            for (int i = 0; i < A.length; i++) {
                partialSum += A[i];
            }
            return totalSum - partialSum;
        }
        else
            return 0;

    }

}
