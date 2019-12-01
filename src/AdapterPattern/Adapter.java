package AdapterPattern;

public class Adapter extends Target {
    Adaptee adaptee = new Adaptee();

    public void request(){
        adaptee.specialRequest();
    }
}
