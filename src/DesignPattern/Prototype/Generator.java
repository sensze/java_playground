package DesignPattern.Prototype;

public interface Generator {
    Generator withPrefix(String prefix);
    Generator withNumberLengthInEachBracketNumber(int numberLengthInEachBracketNumber);

    Generator withTotalBracketNumber(int totalBracketNumber);

    Generator withDelimiter(String delimiter);

    Generator withSuffix(String suffix);

    String generate();
}
