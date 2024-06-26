import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
// import java.util.stream.Stream;

class FilterMapExample {
    // static Predicate <Integer> p=new Predicate<Integer>(){ //Predicate is a functional interface hence anonymous class knows which method to implement and we ca use lambda function
    //     public boolean test(Integer t) {
    //         return t%2==0;
    //     };
    // };
    static Predicate <Integer> p=(t)-> t%2==0;

    // static Function<String, Integer> f=new Function<String,Integer>(){

    //     @Override
    //     public Integer apply(String t) {
            
    //       return Integer.valueOf(t);
    //     }

    // };
    
    static Function<String, Integer> f=(t) ->Integer.valueOf(t); //We have used lamda function here because "Function" is a functional interface
      


    static void showFilterMapWorking(){
        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6");
        System.out.println("original list: " + numbers);
        List<Integer> even = numbers.stream()
                                    .map(f)
                                    .filter(p)
                                    .collect(Collectors.toList());
      
        System.out.println("processed list, only even numbers: " + even);
       }
    }


