package StatePattern;

public class EveningState implements State {
    public void action(OneDay oneDay){
        if(17<= oneDay.getHour() && oneDay.getHour() <18){
            System.out.println("恰晚饭！");
        }else if(18 <= oneDay.getHour() && oneDay.getHour() <= 21){
            System.out.println("学习ing...");
        }else if(21 <oneDay.getHour()){
            System.out.println("睡觉觉~");
        }else{
            oneDay.setCurrent(new AfternoonState());
            oneDay.showAction();
        }
    }
}
