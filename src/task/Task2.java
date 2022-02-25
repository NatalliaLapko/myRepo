package task;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Task2 {


    List<Integer> collection = Arrays.asList(5, 2, 8, 6, -8, 15, 28, -63, -55);
    List<String> list = Arrays.asList("Ivanov", "Petrov", "Antonov", "Astrickiy", "Sidorov", "Agafyev");

    void method1() {

        collection = collection.stream().map((x) ->{if (x < 0) return x * -1; else return x;}).collect(Collectors.toList());
        System.out.println(collection);
    }

    void method2() {
        collection = collection.stream().map((x) ->{if (x%2 ==0) return x * 100; else return x - 100;}).collect(Collectors.toList());
        System.out.println(collection);
    }

    void method3() {
        List<String> workList = list.stream().filter(x -> x.startsWith("A")).collect(Collectors.toList());
        System.out.println(workList);

    }

}









