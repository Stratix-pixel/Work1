package HomeworkWeek11.Problem3;

import java.util.Random;
import java.util.stream.Stream;

/**Generate a random integer between 3 and 13; this will be the length of the word
   Randomly generate letters
   Optional: Ensure that at least 1 in every 3 letters is a vowel**/

 public class StringGenerator {

    public String generateString(){
        StringBuilder st = new StringBuilder();
        Stream.iterate(0, i -> i + 1)
                .limit(new Random().nextInt(8 + 1) + 4) // [4,12] or (3,13)
                .forEach(ch -> st.append((char) (new Random().nextInt(25 + 1) + 97)));
        if(!hasAtLeastOneVowel(st.toString())){
            return generateString();
        }
        return st.toString();
    }


    public boolean hasAtLeastOneVowel(String string) {
        return Stream.iterate(0, i -> i + 1)
                .limit(string.length() - 2)
                .allMatch(it -> string
                        .substring(it, it + 3)
                        .matches(".*[aeiou].*"));
    }

}
