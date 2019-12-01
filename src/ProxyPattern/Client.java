package ProxyPattern;

public class Client {
    public static void main(String[] args) {
        Proxy RealEstateAgent = new Proxy();
        RealEstateAgent.request();
    }
}
