package bad;

public class ATM {
    protected double sum;

    public ATM(double sum){
        this.sum = sum;
    }
    public double giveMoney(double sum){
        this.sum-=sum;
        return sum;
    }
}
