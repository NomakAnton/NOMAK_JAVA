

public class Main {
    public static void main(String[] args) {
        int matrix[][] = new int[5][5];
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
        bottomLeft = bottomLeft +1;
        int result = matrix.length*matrix.length;
        while (true){
            if (count < matrix.length * matrix.length) {
                for (int i = topLeft; i <= topRight; i++) {
                    matrix[topLeft][i] = count;
                    count++;
                }
                topLeft = topLeft + 1;
            }
            else break;
            if (count < matrix.length*matrix.length){
                for (int i = topLeft; i <= topRight; i++) {
                    matrix[i][topRight] = count;
                    count++;
                }
                topRight = topRight - 1;
            }
            else break;
            if(count < matrix.length*matrix.length){
                for (int i = bottomRight; i >=topLeft-1 ; i--) {
                    matrix[topRight+1][i] = count;
                    count++;
                }
                bottomRight = bottomRight -1;
            }
            else break;
            if(count < matrix.length*matrix.length){
                for (int i = bottomRight+1;i >= topLeft ; i--) {
                    matrix[i][bottomLeft] = count;
                    count++;
                }
                bottomLeft = bottomLeft +1;
            }
            else break;
        }
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                if(matrix[i][j] == 0){
                    matrix[i][j] = count;
                    break;
                }
            }
        }

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                System.out.print(matrix [i][j] + " ");
            }
            System.out.println();
        }
    }
}
