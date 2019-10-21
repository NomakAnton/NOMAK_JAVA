import java.util.Random;

public class Channel {
    private int MAX_SIZE_PROGRAM = 5;
    private Program program [];
    private String name;
    private int count;

    public Channel(String name){
        this.name = name;
        this.program = new Program[MAX_SIZE_PROGRAM];
        this.count = 0;
    }
    public void addProgram(Program program){
        this.program[count] = program;
        count++;
    }
    public void isGoingProgram(){
        Random random = new Random();
        System.out.println("На канале идет передача " + this.program[random.nextInt(4)].getName());

    }
    public String getName() {
        return name;
    }
}
