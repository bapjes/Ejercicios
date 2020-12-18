package TopTal;

public class TimeComplexity {


    public static void main(String[] args) {

       int output = solution (1,1,3);
       ///int output = solution (10, 1000000000,2);
        System.out.println(output);
    }

     public static int solution(int X, int Y, int D)
     {
         int jumps,distance;
         if (X>0 && Y>0 && D>0)
         {
             if (X<=Y)
             {
                 distance = Y-X;
                 jumps = distance / D;
                 if (jumps >0)
                 {
                     if (distance % jumps == 0) {
                         return jumps;
                     } else
                         return jumps + 1;
                 }
             }
         }
         return 0;
     }
}
