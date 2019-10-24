package bad;

public class Main {
    public static void main(String[] args) {
        SberbandATM sberbandATM = new SberbandATM(200);
        System.out.println(sberbandATM.giveMoneyToClient(100));

        System.out.println(sberbandATM.giveMoney(50));//получаем доступ к методу родителя
    }
}
