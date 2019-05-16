package lambda.forEach;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class ForEach {

    public static void main(String[] args) {

        //before 8
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        for (Integer number : numbers) {
            System.out.println(number);
        }

        //after 8
//        numbers.forEach(num -> System.out.println(num));
        numbers.forEach(System.out::println);

        Map<Integer, Integer> numbersMap = new HashMap<>();
        numbersMap.put(1,100);
        numbersMap.put(2,200);
        numbersMap.put(3,300);

        //before
        for (Map.Entry<Integer,Integer> nums : numbersMap.entrySet()){
            System.out.println("Key : " + nums.getKey() + "value : " + nums.getValue());
        }

        //with lambda
        numbersMap.forEach((k,v) -> System.out.println("Key : " + k + "Value : " + v));


        //for each with conditions

        for (Integer num: numbers) {
            if(num > 2)
                System.out.println(num);
        }

        numbers.forEach(num -> {
            if (num >2 ){
                System.out.println(num);
            }
        });

        //Function

        Function<String,Integer> toInteger = string -> parse(string);
        Integer integer = toInteger.apply("5");

        }

    private static Integer parse(String s){
        return Integer.parseInt(s);
    }

}

