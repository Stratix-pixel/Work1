package LambdaFunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaWithLambda {


    private List<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).collect(Collectors.toList());

    

    public List<Integer> pow() {
        return apply(n -> (int) Math.pow(n, 2));
    }


    
    public List<Integer> divideBy(int d) {
        return filterBy(n -> n % d == 0);
    }

    
    public List<Integer> greaterThan(int limit) {
        return filterBy(n -> n > limit);
    }

    public List<Integer> lessThan(int limit) {
        return filterBy(n -> n < limit);
    }


    public List<Integer> filterBy(Predicate p)
    {
        List<Integer> result = new ArrayList<>();
        for (Integer n : numbers) {
            if (p.accept(n)) {
                result.add(n);
            }
        }
        return result;
    }

    public List<Integer> apply(Function1 f) {
        List<Integer> result = new ArrayList<>();
        for (Integer n : numbers) {
            result.add(f.apply(n));
        }
        return result;
    }
    public List<String> concatenateInBulkOf(int b) {
        List<String> result = new ArrayList<>();
        String temp = "";
        for (int i = 0; i < numbers.size(); i++) {
            temp += numbers.get(i);
            if ((i + 1) % b == 0) {
                result.add(temp);
                temp = "";
            }
        }
        if (!temp.isEmpty()) {
            result.add(temp);
        }
        return result;
    }


}


interface Predicate {
    boolean accept(int number);
}

interface Function1 {
    int apply(int number);
}



class LambdasTestWithLambda {
    public static void main(String[] args) {
        LambdaWithLambda lambda = new LambdaWithLambda();

        System.out.println("Greater than 3: " + lambda.greaterThan(3));
        System.out.println("Less than 3: " + lambda.lessThan(3));
        System.out.println("Numbers diveded by 2: " + lambda.divideBy(2));
        System.out.println("Numbers ^ 2: " + lambda.pow());

    }
}
