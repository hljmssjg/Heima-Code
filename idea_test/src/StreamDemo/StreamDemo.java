package StreamDemo;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Stream<String> listStream = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> setStream = set.stream();

        //间接生成流
        Map<String,Integer>map = new HashMap<>();
        Stream<String> keyStream = map.keySet().stream();
        Stream<Integer> valueStream = map.values().stream();
        Stream<Map.Entry<String,Integer>>entryStream = map.entrySet().stream();

        String[] strArray = {"hello","world"};
        Stream<String> strArrayStream = Stream.of(strArray);
        Stream<String> stringStream2 = Stream.of("hello","world");
        Stream<Integer> intStream = Stream.of(10,20,30);
    }
}
