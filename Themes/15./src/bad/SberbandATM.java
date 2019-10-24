package bad;

public class SberbandATM extends  ATM {

    public SberbandATM(double sum){
        super(sum);
    }
    public double giveMoneyToClient(double sum){
        double tempSum = giveMoney(sum);
       return tempSum * 0.9;
    }

}
