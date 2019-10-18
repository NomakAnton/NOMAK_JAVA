public class Main {
    public static void main(String[] args) {
        Human anton = new Human("Anton");
        Card alfa = new Card("AlfaBank",4321,anton,777);
        Card vtb = new Card("VneshTorgBank",5132,anton,111);

        anton.addCard(alfa);
        anton.addCard(vtb);

        ATM atm = new ATM();
        atm.setTotalSum(100);

        anton.takeCash(atm,777,4321,150);
        System.out.println(anton.getCash());
        System.out.println(atm.getTotalSum());
    }
}
