public class DnaToRna {
    public String dnaToRna(String dna) {

        return dna.replaceAll("T", "U");

    }

    public static void main(String[] args) {
        DnaToRna dnaToRna = new DnaToRna();
        System.out.println(dnaToRna.dnaToRna("TTTT"));
    }
}
