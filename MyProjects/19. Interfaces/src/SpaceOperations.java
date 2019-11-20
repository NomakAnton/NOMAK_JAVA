public class SpaceOperations {


    public static void moveALL(Figure figeres[],double x,double y,double z){
        for (int i = 0; i < figeres.length ; i++) {
            figeres[i].move(x, y, z);
        }
    }
    public static void scaleAll(Scalable scalable[],double value){
        for (int i = 0; i <scalable.length ; i++) {
            scalable[i].scale(value);
        }
    }

}
