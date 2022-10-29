package Module11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPITest {
    public static void main(String[] args) {
        String[] names = { "Roman", "Ivan", "Sergey", "Peter", "Alex", "Mykola", "Andrey", "Michail"};
        String[] numbers = {"1, 2, 0", "4, 5"};
        StreamAPI streamAPI = new StreamAPI();
        //Task1
        System.out.println(streamAPI.getOddNamesFromList(names));
        //Task2
        System.out.println(streamAPI.getSortedAndUpperCaseList(names));
        //Task3
        System.out.println(streamAPI.getSortedNumbers(numbers));
        //Task4
        streamAPI.generateRandomNumbers(25214903917l, 11, 2^48);
        // Task5
        Stream<Integer> stream1 = Stream.of(10, 20, 30, 40, 50, 60);
        Stream<Integer> stream2 = Stream.of(15, 25, 35, 45);

        streamAPI.zipIterator(stream1, stream2)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

}
