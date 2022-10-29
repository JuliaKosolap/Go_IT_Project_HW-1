package Module11;

import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {
    public String getOddNamesFromList(String[] names) {

        String result = IntStream
                .range(0, names.length)
                .filter(i -> i % 2 != 0)
                .mapToObj(i -> (", " + i + ". " + names[i]))
                .collect(Collectors.joining())
                        .substring(2);
        return result;
    }
    public List<String> getSortedAndUpperCaseList(String[] names) {
        List<String> list = Arrays.asList(names)
                .stream()
                .sorted(Comparator.reverseOrder())
                .map(n -> n.toUpperCase())
                .collect(Collectors.toList());
        return list;
    }
    public String getSortedNumbers(String[] numbers) {
       String string =  Arrays.stream(numbers)
                .map(line -> Arrays.asList(line.split(", ")))
                .flatMap(l -> l.stream())
                .sorted().collect(Collectors.joining(", "));
        return string;
    }

    public Stream<Long> generateRandomNumbers(Long a, int c, int m) {
        MyRandom random = new MyRandom(a, c, m);
        Stream<Long> longStream = Stream.iterate(1l, (seed) -> random.seed(seed).next());
        longStream
                .limit(50)
                .peek(System.out::println)
                .collect(Collectors.toList());
        return longStream;
    }
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        List<T> firstList = first.collect(Collectors.toList());
        List<T> secondList = second.collect(Collectors.toList());
        int minSize = Math.min(firstList.size(), secondList.size());
        List<T> result = new ArrayList<>();
        for (int i = 0; i < minSize; i++) {
            result.add(firstList.get(i));
            result.add(secondList.get(i));
        }
        return result.stream();
    }

    public static <T> Stream<T> zipIterator(Stream<T> first, Stream<T> second) {
        Iterator<T> iteratorFirst = first.iterator();
        Iterator<T> iteratorSecond = second.iterator();
        List<T> result = new ArrayList<>();
        while (iteratorFirst.hasNext() && iteratorSecond.hasNext()) {
            result.add(iteratorFirst.next());
            result.add(iteratorSecond.next());
        }
        return result.stream();
    }

}
