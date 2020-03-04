package utils;

import java.io.*;

public class IdGenerator {
    private int lastGenerateId;//поле в котором мы храним IDшник считаный с файла(в котором хранится предыдущий id)
    private String idSequenceFileName;//поле в котором мы храним название файла в котором лежит последний id.
    public IdGenerator(String idSequenceFileName){
        this.idSequenceFileName = idSequenceFileName;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(idSequenceFileName));
            String lastGeneratedIdAsStrind = reader.readLine();
            this.lastGenerateId = Integer.parseInt(lastGeneratedIdAsStrind);

        }
        catch (IOException e){
            throw  new IllegalArgumentException(e);
        }

    }

    public int generateId(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(idSequenceFileName));
            int result = this.lastGenerateId;
            this.lastGenerateId++;
            writer.write(String.valueOf(lastGenerateId));
            writer.close();
            return result;

        }
        catch (IOException e){
            throw new IllegalArgumentException(e);
        }
    }
}
