package StatePattern;

public class MorningState implements State {
    public void action(OneDay oneDay){
        if(oneDay.getHour() <=8){
            System.out.println("太早了，还没起床！");
        }else if(8< oneDay.getHour() && oneDay.getHour() <=9){
            System.out.println("起床，洗簌，吃早饭！");
        }else{
            oneDay.setCurrent(new ForenoonState());
            oneDay.showAction();
        }
    }
}
