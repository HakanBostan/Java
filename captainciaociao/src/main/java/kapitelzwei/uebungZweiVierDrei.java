package kapitelzwei;

public class uebungZweiVierDrei {

    /**
     * Die Methode liest rechnet Literangaben um
     * 
     * @param n.A.
     * @return n.A.
     */

    public void a243() {
        System.out.print("Gib einen float-Wert ein: ");
        float fvalue = new java.util.Scanner(System.in).nextFloat();
        int vorkomma = (int) fvalue;
        float nachkomma = fvalue - vorkomma;
        String formattedNachkomma = String.format("%.3f", nachkomma);
        String formattedValue = String.format("%.0f", fvalue);

        int zerocounter = 0;

        if (vorkomma >= 1) {
            System.out.println(formattedValue + " l");
        } else
            for (int i = 0; i < formattedNachkomma.length(); i++) {
                if (formattedNachkomma.charAt(i) == '0') {
                    zerocounter++;
                }
            }

        if (zerocounter == 1) {
            formattedNachkomma = formattedNachkomma.replace(",", ".");
            float nachkommaFloat = Float.parseFloat(formattedNachkomma); // Float in String convertieren.
            int result = (int) (nachkommaFloat * 100);

            System.out.println(result + " cl");

        }

        if (zerocounter == 2) {
            formattedNachkomma = formattedNachkomma.replace(",", ".");
            float nachkommaFloat = Float.parseFloat(formattedNachkomma); // Float in String convertieren.
            int result = (int) (nachkommaFloat * 1000);

            System.out.println(result + " ml");
        }

        if (zerocounter == 3) {
            formattedNachkomma = formattedNachkomma.replace(",", ".");
            float nachkommaFloat = Float.parseFloat(formattedNachkomma); // Float in String convertieren.
            int result = (int) (nachkommaFloat * 1000);

            System.out.println(result + " ml");
        }

        if (zerocounter == 4) {
            System.out.println("Value to small to display");
        }
    }
}
