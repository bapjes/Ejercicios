package TopTal;


import java.util.ArrayList;

public class Brackets {

    public static void main(String[] args) {

        //String S = "{[()()]}";
        //String S = "([)()]";
        String S = "+ )( + ()";

        // "([)()]" is not.
        int output = solution(S);
        System.out.println(output);
    }

    public static int  solution(String S)
    {


        int index,j=-1;


       if (S.length() <  0 && S.length()>200000)
            return 0;

       for (int  i = 0; i < S.length(); i++) {
           char c = S.charAt(i);
           if (c != '{' && c != '(' && c != '[' && c != '}' && c != ')' && c != ']') {
               return 0;
           }
       }

        char[] stack = new char[S.length()];

        for (int  i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if (c =='{' || c =='(' || c =='[' ) {
                j++;
                stack[j] = c;

                              }

            else if (c == '}' || c == ')' || c == ']'){

                if (j< 0) return 0;
                char value =  stack[j];
                String a = String.valueOf(value) + String.valueOf(c)  ;

                if (!a.equals("{}") && !a.equals("()") && !a.equals("[]"))
                    return 0;
               j--;
            }
            else
                return 0;
          }
            if (j<0)
                  return 1;
            else
                return 0;
                }
}
