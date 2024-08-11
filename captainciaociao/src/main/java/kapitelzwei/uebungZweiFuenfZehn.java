package kapitelzwei;

/**
 * 
 * Die Methode gibt die zahlen in einem kleinen Fahnenmotiv zurück. 
 * 
 * @param n.A.
 * @return n.A.
 */

public class uebungZweiFuenfZehn {

    public void a2510() {

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            if( i >= 1){
                System.out.println();
            }

        }
    }
    
}
