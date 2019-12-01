package StatePattern;

public class Client {
    public static void main(String[] args) {
        OneDay oneDay = new OneDay(new MorningState());
        oneDay.setHour(7);
        oneDay.showAction();
        oneDay.setHour(8);
        oneDay.showAction();
        oneDay.setHour(9);
        oneDay.showAction();
        oneDay.setHour(10);
        oneDay.showAction();
        oneDay.setHour(11);
        oneDay.showAction();
        oneDay.setHour(12);
        oneDay.showAction();
        oneDay.setHour(13);
        oneDay.showAction();
        oneDay.setHour(14);
        oneDay.showAction();
        oneDay.setHour(17);
        oneDay.showAction();
        oneDay.setHour(18);
        oneDay.showAction();
        oneDay.setHour(20);
        oneDay.showAction();
        oneDay.setHour(21);
        oneDay.showAction();
        oneDay.setHour(22);
        oneDay.showAction();
        oneDay.setHour(23);
        oneDay.showAction();

        System.out.println("\n又是新的一天～");
        oneDay.setHour(1);
        oneDay.showAction();
        oneDay.setHour(4);
        oneDay.showAction();
        oneDay.setHour(7);
        oneDay.showAction();
        oneDay.setHour(8);
        oneDay.showAction();
        oneDay.setHour(9);
        oneDay.showAction();
        oneDay.setHour(10);
        oneDay.showAction();
        oneDay.setHour(11);
        oneDay.showAction();
        oneDay.setHour(12);
        oneDay.showAction();
        oneDay.setHour(13);
        oneDay.showAction();
        oneDay.setHour(14);
        oneDay.showAction();
        oneDay.setHour(17);
        oneDay.showAction();
        oneDay.setHour(18);
        oneDay.showAction();
        oneDay.setHour(20);
        oneDay.showAction();
        oneDay.setHour(21);
        oneDay.showAction();
        oneDay.setHour(22);
        oneDay.showAction();
        oneDay.setHour(23);
        oneDay.showAction();

    }
}
