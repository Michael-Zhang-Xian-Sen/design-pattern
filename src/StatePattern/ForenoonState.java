package StatePattern;

public class ForenoonState implements State {
    public void action(OneDay oneDay){
        if(9 < oneDay.getHour() && oneDay.getHour() < 11){
            System.out.println("学习中...");
        }else if(11 <= oneDay.getHour()){
            oneDay.setCurrent(new NoonState());
            oneDay.showAction();
        }else{
            oneDay.setCurrent(new MorningState());
            oneDay.showAction();
        }
    }
}
