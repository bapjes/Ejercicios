package jStrings;
import javax.swing.*;
import java.util.ArrayList;

public class ArrayBidimensional {

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> grocery = new ArrayList();

        ArrayList<String> bakery = new ArrayList<String>();

        bakery.add("pasta");
        bakery.add("garlic bread");
        bakery.add("donuts");
        System.out.println(bakery);

        ArrayList<String> produce = new ArrayList<>();
        produce.add("tomatoes");
        produce.add("zucchinni");
        produce.add("peppers");

        System.out.println(produce);

        ArrayList<String> beverages = new ArrayList<String>();
        beverages.add("coffee");
        beverages.add("soda");

        grocery.add(bakery);
        grocery.add(produce);
        grocery.add(beverages);

        System.out.println(grocery.get(0).get(1));
        System.out.println(grocery.get(1).get(2));
        System.out.println(grocery.get(2).get(0));

        int numEle = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los datos : "));
        System.out.println(numEle);

    }
}
