package iLoops;

import libs.Input;

public class cancionElefantesFor {

    public static void main(String[] args) {
        int numeroElefantes;
        int i;

        System.out.println("Cuántos elefantes ? ");
        numeroElefantes = Input.get_int();
        System.out.println("un elefante se columpiaba sobre la tela de una araña,\n" +
                "como veia que resistia, fue a llamar a otro elefante");

        for (i=2; i<=numeroElefantes ; i++)
        {
            System.out.println(i + " elefantes se columpiaban sobre la tela de una araña,\n" +
                    "como veian que resistian, fueron a llamar a otro elefante");
        }

    }
}
