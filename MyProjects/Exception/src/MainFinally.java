public class MainFinally {
    public static void main(String[] args) {
        try{
            throw  new IllegalArgumentException("1. IllegalArgumentException");
        }
        catch (IllegalArgumentException e){
            try {

                throw new StackOverflowError("2. StackOverflow");
            }
            catch (StackOverflowError e1){
                throw new IllegalStateException("3. IllegalStateExpection");
            }

        }finally {
            System.out.println("Im here");
        }
    }
}
