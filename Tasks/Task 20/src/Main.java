public class Main {
    public static void main(String[] args) {
        int matrix[][] = new int[5][5];

        int count = 1;

        for (int i = 0; i < matrix.length; i++) {
            matrix[0][i] = count;
            count++;
        }
        for (int i = 1; i < matrix.length; i++) {
            matrix[i][matrix.length - 1] = count;
            count++;
        }
        for (int i = matrix.length - 2; i > -1; i--) {
            matrix[matrix.length - 1][i] = count;
            count++;
        }
        for (int i = matrix.length - 2; i > 0; i--) {
            matrix[i][0] = count;
            count++;
        }
        /*for (int i = 1; i < matrix.length -1 ; i++) {
            matrix[1][i] = count;
            count++;
        }
        for (int i = 2 ; i < matrix.length-1; i++) {
            matrix[i][matrix.length-2] = count;
            count++;
        }
        for (int i = matrix.length-3; i >0 ; i--) {
            matrix[matrix.length-2][i] = count;
            count++;
        }

        for (int i = 1; i < matrix.length-2 ; i++) {
            matrix[2][i] = count;
            count++;
        }









*/




        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                System.out.print(matrix [i][j] + " ");
            }
            System.out.println();
        }


    }
    }
