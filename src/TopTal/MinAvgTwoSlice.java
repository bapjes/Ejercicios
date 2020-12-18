package TopTal;

public class MinAvgTwoSlice {

    public static void main(String[] args) {

        int[] list = {4,2,2,5,1,5,8};
        int output = solution(list);
        System.out.println(output);
    }

    public static int  solution(int[] A) {

        int N = A.length;
        int minindex=0;
        double minAvgVal=(A[0]+A[1])/2; //At least two elements in A.
        double currAvg;

        if (N<2 || N>100000)
            return 0;

        for (int i = 0; i <  N; i++) {
            if (A[i] > 10000 || A[i] < -10000) {
                return 0;
            }
        }
        for(int i=0; i<A.length-2; i++){
            currAvg = ((double)(A[i] + A[i+1]))/2;
            if(currAvg < minAvgVal){
                minAvgVal = currAvg;
                minindex=  i;
            }
            currAvg = ((double)(A[i] + A[i+1] + A[i+2]))/3;
            if(currAvg < minAvgVal){
                minAvgVal = currAvg;
                minindex = i;
            }
        }

        currAvg = ((double)(A[A.length-2] + A[A.length-1]))/2;
        if(currAvg < minAvgVal){
            minAvgVal = currAvg;
            minindex = A.length-2;
        }
        return minindex;
    }

    }
