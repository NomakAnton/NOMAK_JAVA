public class MatrixWorker {


    public static int[][] summ(int [][]a,int[][]b){

    int[][] result = new int[a.length][a.length];

        for (int i = 0; i < result.length ; i++) {
            for (int j = 0; j < result[i].length ; j++) {
                result[i][j] = a[i][j] + b [i][j];
            }
        }
        return result;
    }

    public static void print(int[][]a){
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[i].length ; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] mult(int [][]a,int[][]b){

        int[][] result = new int[a.length][a.length];

        for (int i = 0; i < result.length ; i++) {
            for (int j = 0; j < result[i].length ; j++) {
                result[i][j] = a[i][j] * b [i][j];
            }
        }
        return result;
    }


}
