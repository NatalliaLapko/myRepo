package task;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Task2 {

    ArrayList<Integer> collection = new ArrayList<>(Arrays.asList(5, 2, 8, 6, -8, 15, 28, -63, -55));
    List<String> list = Arrays.asList("Ivanov", "Petrov", "Antonov", "Astrickiy", "Sidorov", "Agafyev");

    void method1() {

        Collection<Integer> col1 = collection.stream().filter(x -> x < 0).map(x -> x * -1).collect(Collectors.toList());

        collection.removeIf(x -> x < 0);
        collection.addAll(col1);
        System.out.println(collection);


    }

    void method2() {
        List<Integer> even = collection.stream().filter(x -> x % 2 == 0).map(x -> x * 100).collect(Collectors.toList());
        List<Integer> odd = collection.stream().filter(x -> x % 2 != 0).map(x -> x - 100).collect(Collectors.toList());
        List<Integer> allNumbers = new ArrayList<>(even);
        allNumbers.addAll(odd);

        System.out.println(allNumbers);

    }


    void method3() {
        List<String> workList = list.stream().filter(x -> x.startsWith("A")).collect(Collectors.toList());
        System.out.println(workList);

    }
}









