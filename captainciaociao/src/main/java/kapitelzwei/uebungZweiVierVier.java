import java.util.Random;

public class uebungZweiVierVier {

        
     /**
     * 
     * Die Methode gibt zufällig eine der Farben aus. 
     * 
     * @param String n.A.
     * @return n.A.
     */

    public void ausgabe11(){

    Random rand = new Random();
    int randomNum = rand.nextInt(3) + 1;
    String fill1 = "blue";
    String fill2 = "green";
    String fill3 = "red";

    if(randomNum == 1){
        System.out.println("<circle cx= 20 cy= 20 r= 5 fill = " + fill1 + " />");
    } else if (randomNum == 2){
        System.out.println("<circle cx= 20 cy= 20 r= 5 fill = " + fill2 + " />");
    } else
        System.out.println("<circle cx= 20 cy= 20 r= 5 fill = " + fill3 + " />");

    }
}
