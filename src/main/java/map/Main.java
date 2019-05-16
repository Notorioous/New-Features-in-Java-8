package map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //PutIfAbsent()
        //before
        Map<String, String> map = new HashMap<>();
        if(map.get("name") == null)
            map.put("name","Gus");

        //after
        map.putIfAbsent("name","Gus");

        //СomputeIfPresent()

        //Если нам необходимо произвести какое-то действие со значением в Map, если оно там есть
        map.put("name","Joan");
        map.computeIfPresent("name",(key,value) -> key + ", " + value);
        System.out.println(map.get("name"));

        //СomputeIfAbsent()

        //Здесь все обратно предыдущей ситуации,  действие произойдет в том случае, если значения нет

        Map<String, String> map1 = new HashMap<>();
//        map1.computeIfAbsent("awesome key",key -> key + ", " + "amazing value");
//        System.out.println(map1.get("awesome key"));

        map1.put("awesome key", "cool value");
        map1.computeIfAbsent("amazing key",key -> key + ", " + "amazing value");
        System.out.println(map1.get("awesome key"));

        //Хотим удалить из Map пару, если совпадает и ключ, и значение?
        map1.put("surname","Petrov");
        map1.remove("surname","Vzgoyan");
        System.out.println(map1.get("surname"));

        //По аналогии с Optional,можно вернуть значение по умолчанию, если с таким ключем нет значения
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("number", 100500);

        Integer number = map2.getOrDefault("number", 10);
        System.out.println(number);

        Integer numb = map2.getOrDefault("numb", 10);
        System.out.println(numb);

        //Если друг понадобилось объединить значение в Map с другим, то это легко сделать с помощью merge()

        Map<String, String> map3 = new HashMap<>();
//        map3.put("question","Bla?");

        //При этом, если такой пары в Map нет, она будет создана

        map3.merge("question","BlaBla",(oldVal, newVal) -> oldVal + newVal);

        System.out.println(map3.get("question"));


    }
}
