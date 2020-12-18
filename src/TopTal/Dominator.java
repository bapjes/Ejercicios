package TopTal;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.HashMap;
import java.util.Map;

public class Dominator {

    public static void main(String[] args) {
        int[] A = {3,4,3,2,3,-1,3,3};
        //int[] A = {2147483647};
        int output = solution(A);
        System.out.println(output);

    }


    public static int solution(int[] A) {
        int min = -2147483647;
        int max = 2147483647;



        if (A.length <0 || A.length > 10000)
            return -1;

        for (int i = 0; i <A.length; i++) {
            if (A[i] > max || A[i] < 0) {
                 return -1;
            }
        }

        Map<Integer, Integer[]> count = new HashMap<>();
        int n = A.length;
        for(int i=0; i<n; ++i){
            if(!count.containsKey(A[i]))
                count.put(A[i], new Integer[]{0,0});
            Integer[] value = new Integer[] {count.get(A[i])[0]+1, i};
            // value[0] = count.get(A[i])[0]+1;
             //value[1] = i;
            count.put(A[i], value);
        }

        for(Map.Entry<Integer, Integer[]> m : count.entrySet())
            if(m.getValue()[0] > n/2) return m.getValue()[1];
        return -1;
   }
}

