package TopTal;


import java.util.ArrayList;

public class Flags {

    public static void main(String[] args) {
        int[] arreglo = {1,5,3,4,3,4,1,2,3,4,6,2};
        int k=5;

        int salida = solution(arreglo);


            System.out.println(salida);
    }


    public static int solution(int[] A) {
        // write your code in Java SE 8
        int[] peaks = new int[A.length];
        int peakStart = 0;
        int peakEnd = 0;
        boolean flag = true;

        if(A.length<0 && A.length>400000 )
            return 0;
        for(int i = 1; i < A.length-1; i++) {
            if (A[i] < 0 || A[i] > 1000000000)
            {
                flag=false;
                break;
            }
        }

        if (flag) {
            for (int i = 1; i < A.length - 1; i++) {
                if (A[i - 1] < A[i] && A[i + 1] < A[i]) {
                    peaks[i] = 1;
                    peakEnd = i + 1;
                }
                if (peakStart == 0) {
                    peakStart = i;
                }

            }
            int x = 1;

            int limit = (int) Math.ceil(Math.sqrt(A.length));
            int prevPeak = 0;
            int counter = 0;
            int max = Integer.MIN_VALUE;

            while (x <= limit) {
                counter = 0;
                prevPeak = 0;
                for (int y = peakStart; y < peakEnd; y++) {
                    //Find the peak points when we have x number of flags.
                    if (peaks[y] == 1 && (prevPeak == 0 || x <= (y - prevPeak))) {
                        counter++;
                        prevPeak = y;
                    }

                    if (counter == x) {
                        break;
                    }
                }

                if (counter <= max) {
                    return max;
                }

                max = counter;
                x++;

            }
            return max;
        }
        return 0;
    }

}
