package kapitelzwei;

public class uebungFuenfZwoelf {

    /**
     * 
     * Die Methode gibt die zahlen in einem kleinen Fahnenmotiv zurück.
     * 
     * @param n.A.
     * @return n.A.
     */

     public void a2512(){
        int breite = 8;
        int haelfte = breite / 2;
       

        String wspac = " ";
        String star = "*";


        for (int i = 1; i <= breite; i += 2) {
            for (int j = 1; j <= 8; j++) {

                if (j == ersteHaelfte) {
                    System.out.print(star);

                }
                if (j == zweiteHaelfte) {
                    System.out.print(star);

                    if (j == 4) {
                        System.out.print(star);
                        ersteHaelfte--;
                        zweiteHaelfte++;
                    }


                }
                System.out.print(wspac);
            }
            System.out.println();
        }

     }



}
