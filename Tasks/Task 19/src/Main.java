public class Main {
    public static void main(String[] args) {
        int matrix [][] = new int[5][5];

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                matrix[i][j] = 12;
            }
        }

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
             if(j < matrix[i].length - i - 1 ){
                 matrix[i][j] = matrix[i][j] * 2;
                 continue;
             }
             if (j > matrix[i].length - i - 1)
                matrix[i][j] = matrix[i][j] / 2;
                continue;
            }
        }

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
