package lambda.electricExample;

public class Main {
    public static void main(String[] args) {

        Switcher switcher = new Switcher();

        //event subscribe
        switcher.addElectricityListener(new Lamp());
        switcher.addElectricityListener(new Radio());
        //anonymous class
        switcher.addElectricityListener(()-> System.out.println("Fire"));


        switcher.switchOn();
    }
}
