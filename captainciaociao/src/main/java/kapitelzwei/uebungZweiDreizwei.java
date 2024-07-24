package kapitelzwei;

public class uebungZweiDreizwei {

     /**
      
     * Die Methode gibt formatierte und normale Strings aus. 
     * Mittels eines Scanners werden Werte für Variablen vergeben. 
     * if abfrage findet statt 
     * 
     * @param n.A.
     * @return n.A.
     */


    public void ausgabe5() {

        System.out.println("Wie viele Flaschen wurden erbeutet?");
        int x = new java.util.Scanner(System.in).nextInt();
        int dividende = x / 2;
        System.out.printf("der Captain bekommt %d Flaschen %n", dividende);

        System.out.printf("die Crew bekommt %d Flaschen%n123", dividende);

        System.out.println("wie viele Crewmitglieder gibt es?");
        int y = new java.util.Scanner(System.in).nextInt();

        if (dividende / 100 > 99) {
            System.out.println("Fair share without remainder? true");
        } else
            System.out.println("Fair share without remainder? false");

    }

}
