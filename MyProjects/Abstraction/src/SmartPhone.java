public class SmartPhone extends CellPhone {

    private String operationSystem;

    public SmartPhone(int year, int hour,String operationSystem) {
        super(year, hour);
        this.operationSystem = operationSystem;
    }
    public void install(String program){
        System.out.println("Устанавливаю программу - " + program);
    }
}
/*
И наконец смартфон который так же наследуется от телефона и наследует все те же поля и методы, но в нем мы добавляем
дополнительное поле - операционная система и добавляем дополнительный метод - установка программ.



 */