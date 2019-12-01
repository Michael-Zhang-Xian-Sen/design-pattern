package BridgePattern;

public class RefinedAbstraction extends Abstraction {
    public void setImplementor(Implementor implementor){
        this.implementor = implementor;
    }

    public void operation(){
        implementor.operation();
    }
}
