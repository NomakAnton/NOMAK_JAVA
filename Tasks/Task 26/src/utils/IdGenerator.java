package utils;

import java.io.*;

public class IdGenerator {
    private int lastGenerateId;
    private String idSequenceFileName;

    public IdGenerator(String fileNameId){
        this.idSequenceFileName = fileNameId;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(idSequenceFileName));
            String lastGenerateIdAsString = reader.readLine();
            lastGenerateId = Integer.parseInt(lastGenerateIdAsString);
            reader.close();

        }
        catch (IOException e){
            throw new IllegalArgumentException(e);
        }
    }

    public int generateId(){
        int result = this.lastGenerateId;
        lastGenerateId++;
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(idSequenceFileName));
            writer.write(String.valueOf(lastGenerateId));
            writer.close();
            return result;
        }
        catch (IOException e){
            throw new IllegalArgumentException(e);
        }
    }
}
