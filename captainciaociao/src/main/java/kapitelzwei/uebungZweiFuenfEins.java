package kapitelzwei;

public class uebungZweiFuenfEins {

    /**
     * 
     * Die Methode nutzt eine while(vorprüfendeschleife) und gibt werte auf der Konsole aus.
     * 
     * @param n.A.
     * @return n.A.
     */


    public void ausgabe13() {
        int counter1 = 0;
        int counter2 = 0;
        String string1 = "<svg height=\"200\" width=\"200\">";
        String string2 = "<rect x= \"50\" y= \"50 \" width= \"100\" height=\"100\" stroke=\"black\" fill=\"none\" \n ";

        System.out.println(string1);


        while (counter2 < 37) {
            String string3 = "      transform=\"rotate(" + counter1 + " 100 100)\" />";
            System.out.println(string2 + string3);
            counter1 = counter1 + 10;
            counter2 ++;
        }

    }
    
}
