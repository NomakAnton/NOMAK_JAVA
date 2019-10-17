public class MainCycle {
    public static void main(String[] args) {
        int matrix[][] = new int[6][6];
        int count = 1;
        int topLeft = 0;
        int topRight = matrix.length - 1;
        int bottomRight = matrix.length - 2;
        int bottomLeft = 0;

        for (int i = topLeft; i <= topRight ; i++) {
            matrix[topLeft][i] = count;
            count++;
        }
        topLeft = topLeft + 1;
        for (int i = topLeft; i <= topRight; i++) {
            matrix[i][topRight] = count;
            count++;
        }
        topRight = topRight - 1;
        for (int i = bottomRight; i >=topLeft-1 ; i--) {
            matrix[topRight+1][i] = count;
            count++;
        }
        bottomRight = bottomRight -1;

        for (int i = bottomRight+1;i >= topLeft ; i--) {
            matrix[i][bottomLeft] = count;
            count++;
        }
    }
}
