package kapitelzwei;

public class uebungFuenfElf {

    /**
     * 
     * Die Methode gibt ein Muster in der Konsole wieder.
     * 
     * @param n.A.
     * @return n.A.
     */

    public void a2511() {

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 11; j++) {

                if(i % 2 == 1){

                if (j % 2 == 0) {
                    System.out.print('#');
                } else {
                    System.out.print('_');
                }

                } else {
                    if (j % 2 == 0) {
                        System.out.print('_');
                    } else {
                        System.out.print('#');
                    }
                }


            }

            System.out.println();
        }


    }

}
