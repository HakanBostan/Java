package kapitelzwei;

public class uebungZweiDreiSechs {

    /**
      
     * Die Methode liest zwei Werte von der Konsole ein und berechnet 
     * und gibt die höhere Zahl bis 21 aus.
     * 
     * @param n.A.
     * @return n.A.
     */

    public void ausgabe9() {
        System.out.print("Gibt eine Zahl ein ");
        int eingabe1 = new java.util.Scanner(System.in).nextInt();
        System.out.print("Gibt erneut eine Zahl ein ");
        int eingabe2 = new java.util.Scanner(System.in).nextInt();


        if(eingabe1 >= eingabe2 && eingabe1 < 22){
            System.out.println("Ausgabe " + eingabe1);
        } else if (eingabe1 > 21 && eingabe2 > 21 ){
            System.out.println("Ausgabe 0");
        } else System.out.println("Ausgabe " + eingabe2);
        


        /**
         * In der Aufgabenstellung steht: 
         * "Eingaben 1 und 10 → führen zum Programmende "
           "Eingaben 1 und 22 → führen zum Programmende "

            nicht ganz klar, was damit gemint ist.
         */

    }

}
