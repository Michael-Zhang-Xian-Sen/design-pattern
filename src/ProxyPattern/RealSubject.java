package ProxyPattern;

public class RealSubject extends Subject{
    public void request(){
        System.out.println("Real Request");
    }
}
