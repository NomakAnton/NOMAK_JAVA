import java.time.chrono.IsoEra;

public class ATM {
    public int getTotalSum() {
        return totalSum;
    }

    private int totalSum;

    public int giveMiney(Card card,int pin,int sum){
        if(card.equals(pin)){
            if (totalSum > sum){
                totalSum -= sum;
                return sum;
            }
            else{
                System.out.println("Денег нет, но Вы держитесь");
                return -1;
            }
        }
        else System.out.println("Пин код неверен");
        return -1;
    }
    public void setTotalSum(int totalSum){
        this.totalSum += totalSum;
    }

}
