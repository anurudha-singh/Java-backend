import java.util.*;
import java.util.stream.Collectors;
// import java.util.stream.Stream;

class FilterMapExample {

    static void showFilterMapWorking(){
        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6");
        System.out.println("original list: " + numbers);
        List<Integer> even = numbers.stream()
                                    .map(s -> Integer.valueOf(s))
                                    .filter(number -> number % 2 == 0)
                                    .collect(Collectors.toList());
      
        System.out.println("processed list, only even numbers: " + even);
       }
    }

