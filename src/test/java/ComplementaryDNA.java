public class ComplementaryDNA {
    public static String makeComplement(String dna) {
        return dna.replaceAll("C", "L")
                .replaceAll("A", "P")
                .replaceAll("G", "C")
                .replaceAll("T", "A")
                .replaceAll("L", "G")
                .replaceAll("P", "T");

    }

    public static void main(String[] args) {
        System.out.println(makeComplement("AAATTCCGG"));
    }
}
