package lambda.electricExample;

public class Radio implements ElectricityConsumer {

    public void radioOn(){
        System.out.println("Радио включилось");
    }

    @Override
    public void electricityOn() {
        radioOn();
    }
}
