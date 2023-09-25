package DesignPattern.Prototype;

public class Main {
    public static void main(String[] args) {
        Generator pmmGenerator = new SerialNumberGenerator()
                .withDelimiter("-")
                .withPrefix("pmm")
                .withSuffix("xxx")
                .withNumberLengthInEachBracketNumber(5)
                .withTotalBracketNumber(2);
        Generator ormGenerator = new SerialNumberGenerator()
                .withDelimiter("-")
                .withPrefix("orm")
                .withSuffix("xxx")
                .withNumberLengthInEachBracketNumber(5)
                .withTotalBracketNumber(3);
        String prdGenerated = pmmGenerator.generate();
        System.out.println("Serial Number:  = " + prdGenerated);
        String prdGenerated2 = pmmGenerator.generate();
        System.out.println("Serial Number:  = " + prdGenerated2);

        String ordGenerated = ormGenerator.generate();
        System.out.println("Serial Number:  = " + ordGenerated);
        String ordGenerated2 = ormGenerator.generate();
        System.out.println("Serial Number:  = " + ordGenerated2);
    }
}
