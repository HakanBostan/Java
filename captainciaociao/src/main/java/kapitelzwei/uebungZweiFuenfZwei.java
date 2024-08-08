package kapitelzwei;

import java.util.Random;

public class uebungZweiFuenfZwei {
    public void a252() {

        /**
         * 
         * Die Methode gibt einein zufälligen String hintereinander aus. 
         * 
         * @param n.A.
         * @return n.A.
         */

        // String string1 = "<svg height=\"100\" width=\"100\">";
        // String string2 = "<circle cx= \"20\" cy=\"20\" r=\"5\" fill=\"blue\" />";
        // String string3 = "<circle cx= \"30\" cy=\"20\" r=\"5\" fill=\"green\" />";
        // String string4 = "<circle cx= \"40\" cy=\"20\" r=\"5\" fill=\"orange\" />";

        String farbe1 = "saphir";
        String farbe2 = "smaragd";
        String farbe3 = "Spessartit-Granat";

        Random rand = new Random();

        for (int i = 0; i < 50; i++) {
            int randomNumb = rand.nextInt(3) + 1;
            if (randomNumb == 1) {
                System.out.print(farbe1 + " ");
            } else if (randomNumb == 2) {
                System.out.print(farbe2 + " ");
            } else
                System.out.print(farbe3 + " ");
        }

    }

}
