package DesignPattern.Prototype;

import java.util.StringJoiner;
import java.util.concurrent.ThreadLocalRandom;

public class SerialNumberGenerator implements Generator{
    private String prefix;
    private int startNumberGenerated;
    private int endNumberGenerated;
    private int totalBracketNumber;
    private String delimiter;
    private String suffix;

    public SerialNumberGenerator(){
        this.totalBracketNumber = 1;
        this.startNumberGenerated = 1;
        this.endNumberGenerated = 9;
        this.delimiter = "";
        this.suffix = "";
        this.prefix = "";
    }

    @Override
    public Generator withPrefix(String prefix){
        if(prefix == null){
            return this;
        }
        this.prefix = prefix;
        return this;
    }

    @Override
    public Generator withNumberLengthInEachBracketNumber(int numberLengthInEachBracketNumber){
        if(numberLengthInEachBracketNumber <= 0){
            return this;
        }
        int start = 1;
        for(int i = 1; i < numberLengthInEachBracketNumber; i++){
            start *= 10;
        }
        int end = 9;
        for(int i = 1; i < numberLengthInEachBracketNumber; i++){
            end *= 10;
            end += 9;
        }
        this.startNumberGenerated = start;
        this.endNumberGenerated = end;
        return this;
    }

    @Override
    public Generator withTotalBracketNumber(int totalBracketNumber){
        if(totalBracketNumber <= 0){
            return this;
        }
        this.totalBracketNumber = totalBracketNumber;
        return this;
    }

    @Override
    public Generator withDelimiter(String delimiter){
        if(delimiter == null){
            return this;
        }
        this.delimiter = delimiter;
        return this;
    }

    @Override
    public Generator withSuffix(String suffix){
        if(suffix == null){
            return this;
        }
        this.suffix = suffix;
        return this;
    }

    @Override
    public String generate(){
        StringJoiner joiner = new StringJoiner(this.delimiter);
        joiner.add(this.prefix);
        for(int i = 0; i < this.totalBracketNumber; i++){
            joiner.add(String.valueOf(ThreadLocalRandom.current().nextInt(this.startNumberGenerated, this.endNumberGenerated + 1)));
        }
        joiner.add(this.suffix);
        return joiner.toString();
    }
}
