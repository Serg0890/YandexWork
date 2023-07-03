import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<String> input = new ArrayList<>();
        input.add("A");
        input.add("B");
        input.add("AA");
        input.add("BB");
        input.add("A");
        input.add("A");
        input.add("AA");
        input.add("C");
        input.add("C");

        Map<String, Integer> result = countWords(input);
        System.out.println(result);


    }

    private static Map<String, Integer> countWords(List<String> input) {
        HashMap<String, Integer> countMap = new HashMap<>();
        for (String value : input) {
            int count = countMap.getOrDefault(value, 0);
            count++;
            countMap.put(value, count);

        }
        return countMap;

    }
}