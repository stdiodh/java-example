package programmers.Lv0.MyString;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyStringSolution {
    public static class StringController {
        StringParse stringParse = new StringParse();
        StringAddCalculator stringAddCalculator = new StringAddCalculator();

        public int calculate(String input) {
            String[] tokens = stringParse.split(input);
            List<Integer> numbers = stringParse.toNumber(tokens);
            return stringAddCalculator.getResult(numbers);
        }
    }

    public static class StringParse {
        public String[] split(String input) {
            return input.replaceAll("[^0-9]", " ").split(" ");
        }

        public List<Integer> toNumber(String[] tokens) {
            return Arrays.stream(tokens)
                    .filter(s -> !s.isBlank())
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        }
    }

    public static class StringAddCalculator {
        public int getResult(List<Integer> parseNumbers) {
            return parseNumbers.stream()
                    .mapToInt(Integer::intValue)
                    .sum();
        }
    }
}
