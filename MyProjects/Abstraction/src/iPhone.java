public class iPhone extends SmartPhone {
    public iPhone(int year,int hour,String operationSystem) {
        super(year,hour,operationSystem);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("подключаю FaceTime");
    }

    @Override
    public void ring(int inputNumber) {

    }

    @Override
    public void install(String program) {
        super.install(program);
    }
}
