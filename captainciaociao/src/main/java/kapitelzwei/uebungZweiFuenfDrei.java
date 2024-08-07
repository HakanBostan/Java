package kapitelzwei;

import java.util.Scanner;

public class uebungZweiFuenfDrei {

    /**
     * 
     * Die Methode liest von der Konsole werte ein und Rechnet diese zusammen
     * 
     * @param n.A.
     * @return n.A.
     */


 public void ausgabe15() {

        System.out.println("Gib eine Zahl an");

//        int pruefzahl1 = 1;
//        while (pruefzahl1 != 0)

        Scanner scanner = new Scanner(System.in);
        int summe = 0;


        while (true){
            String konsolenZahl = scanner.next();
            int konsolenZahlInt = Integer.parseInt(konsolenZahl);


            if(konsolenZahlInt > 1000) {
                System.out.println("Zahl ist zu hoch, gib eine kleiner Zahl an");
                continue;
            }

            if(konsolenZahlInt == 0){
                System.out.println("Sum: " + summe);
                break;
            }

//            if(konsolenZahl.charAt(0) == '-' ){
//                summe -= konsolenZahlInt;
////                summe -= Math.abs(konsolenZahlInt);
//            } else summe += konsolenZahlInt;

            /**
             * Der Grund, warum die Berechnung nicht wie erwartet funktioniert,(summe -= Math.abs(konsolenZahlInt) wäre korrekt)
             * iegt daran, dass du die Zeichenprüfung (konsolenZahl.charAt(0) == '-') durchführst, 
             * nachdem du bereits konsolenZahlInt als Integer-Variable definiert hast. 
             * Die charAt-Methode prüft das erste Zeichen des Strings, nicht die gesamte Zahl.
             *
             * Wenn du eine negative Zahl eingibst, wird sie korrekt als negative Zahl (-2) geparst, 
             * aber du ziehst sie von der Summe ab, als ob sie positiv wäre (d.h., du subtrahierst -2, 
             * was dem Hinzufügen von 2 entspricht).
             * 
             */
            
            summe += konsolenZahlInt;

            System.out.println(konsolenZahl);

        }

    }

}
