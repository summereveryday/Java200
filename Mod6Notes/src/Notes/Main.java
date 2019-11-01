package Notes;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        SubClass sub = new SubClass();
        SuperClass sup = new SuperClass();

        sub.display();


        // array has fixed length, only takes certain data type
        // array list (or list) has no fixed length, and can contain multiple data types

        //By including "<Integer>" it keeps the list type-safe;
        List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        numbers.add(11);
        numbers.forEach(x->System.out.println(x));
        // -> are called Lambdas
        numbers.removeIf(number -> number < 3);
        numbers.forEach(x->System.out.println(x));

        // Streams work better/faster than for loops
        List<Integer> even = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
        even.forEach(x->System.out.println(x));
    }
}