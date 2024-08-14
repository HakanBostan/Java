package kapitelzwei;

public class uebungFuenfZwoelf {

    /**
     * 
     * Die Methode gibt die zahlen in einem kleinen Fahnenmotiv zurück.
     * 
     * @param n.A.
     * @return n.A.
     */

    public void a2512() {
        int breite = 8;
        int haelfte = breite / 2;
        int ersteHaelfte = 4;
        int ersteHaelfteHealfte = ersteHaelfte - 2;
        int zweiteHaelfte = 4;
        int zweiteHaelfteHaelfte = zweiteHaelfte + 1;

        char wspac = ' ';
        char star = '*';

        for (int i = 1; i <= breite; i += 2) {
            for (int j = 1; j <= 8; j++) {

                if (j == haelfte) {
                    System.out.print(star);
                } else if (j < haelfte && j > ersteHaelfteHealfte && i > 1) {
                    System.out.print(star);
                    ersteHaelfteHealfte--;
                } else if (j >= haelfte && j < zweiteHaelfteHaelfte && i > 1) {
                    System.out.print(star);
                } else {
                    System.out.print(wspac);
                }
            }
            zweiteHaelfteHaelfte++;
            System.out.println();
        }

        // ########################## Chat GPT Lösung ##############################
        // char wspac = ' ';
        // char star = '*';
        //
        // int breite = 8;
        // int haelfte = breite / 2;
        //
        // for (int i = 1; i <= haelfte; i++) {
        // for (int j = 1; j <= breite; j++) {
        // if (j >= haelfte - (i - 1) && j <= haelfte + (i - 1)) {
        // System.out.print(star);
        // } else {
        // System.out.print(wspac);
        // }
        // }
        // System.out.println();
        // }

    }

}
