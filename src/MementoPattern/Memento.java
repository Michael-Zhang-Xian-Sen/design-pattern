package MementoPattern;

public class Memento {
    private String state;

    public String getState() {
        return state;
    }

    Memento(String state){
        this.state = state;
    }
}
