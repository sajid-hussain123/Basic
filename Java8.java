import java.util.*;
import java.util.stream.Collectors;

public class Java8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 1, 4, 5, 5);
       /* System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,(i1,i2)->i1>i2?-1:i1<i2?+1:0);
        System.out.println(list);*/
        System.out.println(list);
        Set<Integer> items = new HashSet<>();

        list.stream()
                .filter(n -> !items.add(n)) // Set.add() returns false if the element was already in the set.
                .collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println(items);





        /*Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);*/

    }
}



