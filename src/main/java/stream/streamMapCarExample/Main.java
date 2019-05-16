package stream.streamMapCarExample;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        List<Car> cars = Arrays.asList(
//                new Car("AA1111BX", 2007),
//                new Car("AM1111BE", 2009),
//                new Car("AK5555IT", 2010),
//                new Car("AI5601CC", 2015),
//                new Car("AI3838PP", 2017));
//
//        for (Car car: cars) {
//            System.out.println(car.getNumber());
//        }
//
//        cars.stream()
//                .map(Car::getNumber)
//                .forEach(System.out::println);

        List<Car> cars1 = Arrays.asList(
                new Car("AA1111BX", 2007),
                new Car("AK5555IT", 2010),
                new Car(null, 2012),
                new Car("", 2015),
                new Car("AI3838PP", 2017));

        for (Car car : cars1) {
            if (car.getNumber() != null && !car.getNumber().isEmpty() && car.getYear() > 2010)
                System.out.println(car.getNumber());
        }

        cars1.stream()
                .filter(car -> car.getNumber() != null && car.getYear() > 2010 && !car.getNumber().isEmpty())
                .forEach(Car::getNumber);
    }
}
