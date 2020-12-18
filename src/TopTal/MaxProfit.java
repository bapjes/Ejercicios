package TopTal;

public class MaxProfit {

    public static void main(String[] args) {
        int[] arreglo = {23171,21011,21123,21366,21013,21367};


        int salida = solution(arreglo);


            System.out.println(salida);
    }

    public static int solution(int[] A) {
        int max_profit = 0;
        int buy_price = 0;
        int sell_price = 0;


        boolean change_buy_index = true;

        if (A.length <0 || A.length > 400000)
            return (0);

        for (int i = 0; i <A.length; i++) {
            if (A[i] > 200000 || A[i] < 0) {
                return 0;
            }
        }


        for (int i = 0; i < A.length - 1; i++) {


            sell_price = A[i + 1];


            if (change_buy_index) {
                buy_price = A[i];
            }


            if (sell_price < buy_price) {
                change_buy_index = true;

            }


            else {
                int temp_profit = sell_price - buy_price;
                if (temp_profit > max_profit) {
                    max_profit = temp_profit;
                }
                change_buy_index = false;
            }

        }

        return max_profit;
    }


}
