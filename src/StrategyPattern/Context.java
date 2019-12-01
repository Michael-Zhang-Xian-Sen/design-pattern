package StrategyPattern;

public class Context {
    private Strategy strategy;

    Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void contextInterface(){
        strategy.algorithmInterface();
    }
}
