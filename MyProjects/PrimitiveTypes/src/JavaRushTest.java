import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class JavaRushTest {
    public static void main(String[] args)throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer,String>map = new HashMap<>();

        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        ArrayList<String>list = new ArrayList<>();
        String s = reader.readLine();
        while (!s.isEmpty()){
            int x = Integer.parseInt(s);
            String a =  reader.readLine();
            map.put(x,a);
            s = reader.readLine();
        }

       for(Map.Entry<Integer,String>pair : map.entrySet()){
           Integer key = pair.getKey();
           String value = pair.getValue();
           System.out.println(key + " " + value);
       }
    }
}
