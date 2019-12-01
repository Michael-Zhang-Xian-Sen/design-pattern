package StatePattern;

/**
 * 代码可以更整洁一些。双向实在没必要。
 */
public class AfternoonState implements State {
    public void action(OneDay oneDay){
        if(12 <= oneDay.getHour() && oneDay.getHour() < 17){
            System.out.println("学习ing...");
        }else if(17 <= oneDay.getHour()){
            oneDay.setCurrent(new EveningState());
            oneDay.showAction();
        }else{
            oneDay.setCurrent(new NoonState());
            oneDay.showAction();
        }
    }
}
