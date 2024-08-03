package kapitelzwei;

public class uebungZweiDreiFuenf {

       
     /**
      
     * Die Methode gibt mittels ternären Operator eine bestimmte Ausgabe aus. 
     * 
     * @param int noOfBottles
     * @return n.A.
     */



    public void ausgabe8(int noOfBottles) {
        String result = (noOfBottles == 1) ? "1 bottle of rum " : noOfBottles + " bottles of rum" ;
        System.out.println(result);
    }
}
