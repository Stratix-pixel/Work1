package HomeworkWeek11.Problem3;

import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringsProcessorImplementations implements StringsProcessor{
    String word;

    public StringsProcessorImplementations(String word) {
        this.word = word;
    }

    @Override
    public void StringsPrinter() {
        System.out.print(this.word);
    }

    @Override
    public void VowelsCounter() {
        System.out.print(
                getStream(s -> s.matches(".*[aeiou].*"))
                .count()
        );
    }

    @Override
    public void ConsonantsCounter() {
        System.out.print(
                getStream(s -> (!s.matches(".*[aeiou].*")) && s.matches("[a-zA-Z]+"))
                .count()
        );
    }

    @Override
    public void StringsLength() { System.out.print(this.word.length()); }

    @Override
    public void VowelsRemover() {
        StringBuilder st = new StringBuilder();
        getStream(s -> !s.matches(".*[aeiou].*"))
                .forEach(ch -> st.append(String.valueOf(ch)));
        System.out.print(st);
    }


    public Stream<Character> getStream(Predicate<String> p)
    {
        return word.chars()
                .mapToObj(ch -> (char) ch)
                .filter(ch -> p.test(String.valueOf(ch)));
    }
}
