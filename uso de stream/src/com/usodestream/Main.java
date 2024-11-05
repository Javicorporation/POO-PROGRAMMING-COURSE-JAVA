package com.usodestream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> streamDeStrings = Stream.of("Hello", "World", "que", "tal")
                .map(v  -> v.toUpperCase());
                //.filter(s -> s.contains("hola"));

        // creamos el stream en una lista
        List<String> listas = streamDeStrings.collect(Collectors.toList());

        System.out.println(listas);

    }
}
