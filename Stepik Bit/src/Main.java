public class Main {
    public static void main(String[] args) {
        int a = 32;
        String s = Integer.toBinaryString(32);
        System.out.println(flipBit(4,30));
    }
    public static int flipBit(int value,int bitIndex){
        return value^(1<<(bitIndex-1));
    }
}
