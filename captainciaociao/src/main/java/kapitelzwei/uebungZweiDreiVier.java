package kapitelzwei;

import java.math.BigDecimal;
import java.util.Scanner;

public class uebungZweiDreiVier {

    
     /**
      
     * Die Methode liest einen Wert von der Konsole ein und berechnet 
     * mit wie vielen Euro und Cent Stücken der Betrag zu standekommt.
     * 
     * @param n.A.
     * @return n.A.
     */

  public void ausgabe7() {
Scanner scanner = new Scanner(System.in);
        System.out.print("Gib einen float-Wert ein: ");
        float fvalue = scanner.nextFloat();

                                                // Zeile 25 bis 36 von Chatpt. 

        // Umwandlung des float-Wertes in einen BigDecimal
        BigDecimal bdValue = new BigDecimal(Float.toString(fvalue));

        // Ganzzahlteil extrahieren
        int vorKommaInt = bdValue.intValue();

        // Nachkommateil extrahieren
        BigDecimal bdNachKomma = bdValue.subtract(new BigDecimal(vorKommaInt));
        bdNachKomma = bdNachKomma.movePointRight(bdNachKomma.scale());

        // Konvertieren des Nachkommateils in einen int-Wert
        int nachKommaInt = bdNachKomma.intValue();


        int counterEuroZwei = 0;
        int counterEuroEins = 0;
        int counterCentFufi = 0;
        int counterCentZwani = 0;
        int counterCentZehner = 0;
        int counterCentFunfer = 0;
        int counterCentZweier = 0;
        int counterCentEiner = 0;


        /**
         * 
            hier wird geschaut wie oft die Euro und Centbeträge in die angegeben Zahl passen. 
            genutzt wird dafür der Modulo operator mit hilfe von mehreren if abfragen.
            
            Der Code ist nicht vollständig geschrieben und nur für das Vorgegeben Beispiel angelegt. 
            Abweichende Beträge würden keine Korrekten Ergebnisse liefern. 

            Als nächstes prüfen wie man Effizienter des Code schreiben kann.

         */


        if(vorKommaInt >=2 ){
             counterEuroZwei = vorKommaInt / 2;
             if(vorKommaInt % 2 == 1){
                 counterEuroEins = 1;
             }

        } else counterEuroEins++;


        if(nachKommaInt >= 50 ){
            counterCentFufi ++;

            int neuesumme = nachKommaInt % 50;
            counterCentZwani = neuesumme / 20;
            neuesumme = neuesumme % 20;
            /**
             *  ... hier weiter mit jedem Cent betrag.
             */


            // am Ende
            if( nachKommaInt % 2 == 1){
                counterCentEiner++;
            }


        }

        System.out.println(counterEuroZwei + " x 2 Euro \n" + counterEuroEins + " x 1 Euro\n"
                + counterCentFufi + " x 50 Cent\n" + counterCentZwani + " x 20 Cent\n" + counterCentZehner + " x 10 Cent\n"
                + counterCentFunfer + " x 5 Cent\n" + counterCentZweier + " x 2 Cent\n" + counterCentEiner + " x 1 Cent");




    }

}
