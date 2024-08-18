package kapitelzwei;

public class uebungZweiFuenfDreizehn {

    public void a2513() {

        /**
         * 
         * Die Methode gibt auf der Konsole ein bestimmtes Muster aus.
         * 
         * @param n.A.
         * @return n.A.
         */

        int repitions = 3;
        String fischRechts = "><> ";
        String fischLinks = "<>< ";

        for (int i = 0; i < repitions; i++) {
            for (int j = 0; j < repitions + repitions; j++) {
                if (j < repitions) {
                    System.out.print(fischRechts);
                } else
                    System.out.print(fischLinks);
            }
            System.out.println();
        }

    }

}
