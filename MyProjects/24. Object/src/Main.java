import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {

    public static void printIfEquals(Object a,Object b){
        if(a.equals(b)){
            System.out.println("Yes, they're equal");
        }
        else {
            System.out.println("No,  they're not equals");
        }
    }
    public static void main(String[] args) {
        Human marsel = new Human(25,1.85);
        Human anotherHuman = new Human(25,1.85);

        System.out.println(marsel.equals(anotherHuman));
        System.out.println(marsel.equals(new IllegalAccessError()));
        printIfEquals(marsel,anotherHuman);
        System.out.println(marsel);
    }
}
