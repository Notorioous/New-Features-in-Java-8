package lambda.electricExample;

import java.util.ArrayList;
import java.util.List;

public class Switcher {

    private List<ElectricityConsumer> consumers = new ArrayList<>();

    public void addElectricityListener(ElectricityConsumer listener){
        consumers.add(listener);
    }

    public void removeElectricityListener(ElectricityConsumer listener){
        consumers.remove(listener);
    }


     void switchOn(){
        System.out.println("Выключатель включен");
//
//        if (consumers != null)
//            consumers.electricityOn();

//         for (ElectricityConsumer cons: consumers) {
//             cons.electricityOn();
//         }

         consumers.forEach(ElectricityConsumer::electricityOn);
    }


}
