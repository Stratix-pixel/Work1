package LambdaFunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaBasic {

    private List<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).collect(Collectors.toList());

    
    public List<Integer> greaterThan(int limit) {
        List<Integer> result = new ArrayList<>();

        for (Integer n : numbers) {
            if (n > limit) {
                result.add(n);
            }
        }
        return result;
    }

    
    public List<Integer> lessThan(int limit) {
        List<Integer> result = new ArrayList<>();

        for (Integer n : numbers) {
            if (n < limit) {
                result.add(n);
            }
        }

        return result;
    }

   
    public List<Integer> divideBy(int d) {
        List<Integer> result = new ArrayList<>();
        for (Integer n : numbers) {
            if (n % d == 0)
                result.add(n);
        }
        return result;
    }


   
    public List<Integer> pow() {
        List<Integer> result = new ArrayList<>();
        for (Integer n : numbers) {
            int power = (int) Math.pow(n, 2);
            result.add(power);
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


    public static void main(String[] args) {
        LambdaBasic lambdaBasic = new LambdaBasic();
        System.out.println("Greater than 6: " + lambdaBasic.greaterThan(6));
        System.out.println("Less than 6: " + lambdaBasic.lessThan(6));
        System.out.println("Numbers diveded by 2: " + lambdaBasic.divideBy(2));
        System.out.println("Numbers ^ 2: " + lambdaBasic.pow());
        System.out.println("Concatenante numbers: " + lambdaBasic.concatenateInBulkOf(4));
    }
}

