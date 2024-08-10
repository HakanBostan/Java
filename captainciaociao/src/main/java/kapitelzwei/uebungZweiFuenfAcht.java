package kapitelzwei;

/**
 * 
 * Die Methode
 * 
 * @param int n
 * @return n.A.
 */

public class uebungZweiFuenfAcht {

    public void a258() {

        double zahl = -12345;
        double zahlZifferCount = zahl;
        int zahldiv = (int) zahl;

        int counter = 0;

        int kleinsteziffer = 9;
        int grosteziffer = 0;

        // schleife um herauszufinden wie oft man interieren muss.
        while (zahlZifferCount >= 1) {
            zahlZifferCount /= 10;
            counter++;
        }

        // für den Fall das für Zahl '0' eingegeben wird, kommt das Wunschergebnis raus.
        if (zahldiv == 0) {
            kleinsteziffer = 0;
        }

        // schleife um kleinste % größte Ziffer herauszufinden

        for (int i = 0; i < counter; i++) {

            {
                int temp = zahldiv % 10;
                zahldiv = zahldiv / 10;

                if (temp <= kleinsteziffer) {
                    kleinsteziffer = temp;
                }

                if (temp >= grosteziffer) {
                    grosteziffer = temp;
                }

            }

        }

        System.out.println(kleinsteziffer + ", " + grosteziffer);
    }

}
