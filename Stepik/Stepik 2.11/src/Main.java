public class Main {
    public static void main(String[] args) {
        int array1[] = {0,2,3,5,6,7};
        int array2[] = {0,23,32,41};
        int arrayResult [] = mergeArrays(array1,array2);
        printArray(arrayResult);


    }
    public static int[] mergeArrays(int[] a1, int[] a2) {
      int resultArray[] = new int[a1.length + a2.length];
      int currentA1 = 0,currentA2 = 0;
        for (int i = 0; i < resultArray.length ; i++) {
            if (currentA1 > a1.length - 1) {
                int a = a2[currentA2];
                resultArray[i] = a;
                currentA2++;
            }
            else if(currentA2 > a2.length-1){
                int a = a1[currentA1];
                resultArray[i] = a;
                currentA1++;
            }
            else if(a1[currentA1]< a2[currentA2]){
                int a = a1[currentA1];
                resultArray[i] = a;
                currentA1++;
            }
            else {
                int b = a2[currentA2];
                resultArray[i] = b;
                currentA2++;
            }
        }

      return resultArray;
    }

    public static void printArray(int []array){
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}
