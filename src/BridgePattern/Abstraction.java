package BridgePattern;

public abstract class Abstraction {
    protected Implementor implementor;

    public abstract void setImplementor(Implementor implementor);

    public abstract void operation();
}
