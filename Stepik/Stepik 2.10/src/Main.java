/**
 * Вычисление факториала
 */

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
    public static BigInteger factorial(int value){
        BigInteger result = new BigInteger("1");
        BigInteger current = new BigInteger("1");
        BigInteger current1 = new BigInteger("1");
        for (int i = 1; i <= value ; i++) {
           result = result.multiply(current);
           current = current.add(current1);
        }
        return result;
    }
}
