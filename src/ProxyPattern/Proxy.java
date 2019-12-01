package ProxyPattern;

public class Proxy extends Subject {
    private RealSubject realSubject;

    public void request(){
        if(realSubject==null){
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
