package techcourse.fp.mission;

import java.util.List;
import java.util.function.Predicate;

public class Calculator {

    public static int sum(List<Integer> numbers, Predicate<Integer> condition) {
        return numbers.stream()
                .filter(condition)
                .reduce(0, Integer::sum);
    }
}
