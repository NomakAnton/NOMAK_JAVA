public class Main {
    public static void main(String[] args) {
        int [][] matrix1 = new int[5][5];
        int [][] matrix2 = new int[5][5];

        for (int i = 0; i < matrix1.length ; i++) {
            for (int j = 0; j < matrix1[i].length ; j++) {
                matrix1[i][j] = 5;
                matrix2[i][j] = 5;
            }
        }
        int[][]result = MatrixWorker.mult(matrix1,matrix2);
        MatrixWorker.print(result);
    }
}
