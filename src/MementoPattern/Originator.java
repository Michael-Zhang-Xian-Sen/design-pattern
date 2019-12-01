package MementoPattern;

public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento(){
        return (new Memento(state));
    }

    public void setMemento(Memento memento){
        state = memento.getState();
    }

    public void show(){
        System.out.println("当前状态为："+state);
    }
}
