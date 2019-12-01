package StatePattern;

public class OneDay {
    private int hour;
    private State current;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public State getCurrent() {
        return current;
    }

    public void setCurrent(State current) {
        this.current = current;
    }

    OneDay(State state){
        this.current = state;
    }

    public void showAction(){
        current.action(this);
    }
}
