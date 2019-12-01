package BuilderPattern;

public class Director {
    // 只需要构建？
    public void construct(Builder builder){
        builder.buildPart1();
        builder.buildPart2();
    }
}
