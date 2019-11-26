public class MainBinary {
    public static void main(String[] args) {
        String s = Integer.toBinaryString(4);
        char c[] = s.toCharArray();
        int one = 0;

        for (int i = 0; i < c.length; i++) {
            if (c[i] == '1'){one++; }

        }
    }
}

