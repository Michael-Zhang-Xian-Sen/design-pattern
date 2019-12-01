package StatePattern;

public class NoonState implements State {
    public void action(OneDay oneDay){
        if(11 <= oneDay.getHour() && oneDay.getHour() < 12){
            System.out.println("恰午饭");
        }else if(12<= oneDay.getHour()){
            oneDay.setCurrent(new AfternoonState());
            oneDay.showAction();
        }else{
            oneDay.setCurrent(new ForenoonState());
            oneDay.showAction();
        }
    }
}
