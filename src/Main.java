package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Старт программы");
        List<Integer> numbers1 = Arrays.asList(5, 8, 7, 21, -11, -52, 0, 89, 4, 8, 9, 46, 45);
        List<Integer> numbers2 = Arrays.asList(9, 8, -2, 7, 6, 89); // проверка списка без четных чисел

        OptionalDouble average = numbers1.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .average();

        if (average.isPresent()) {
            System.out.println("Среднее значение всех четных чисел в списке: " + average.getAsDouble());
        } else {
            System.out.println("В списке нет четных чисел.");
        }

    }
}
