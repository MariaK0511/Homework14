package task1;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        /*
        1. Создать коллекцию класса ArrayList наполнить ее элементами рандомными элементами типа Integer.
С помощью Stream'ов:
- Удалить дубликаты +
- Вывести все четные элементы в диапазоне от 7 до 17 (включительно)+
- Каждый элемент умножить на 2 +
- Отсортировать и вывести на экран первых 4 элемента +
- Вывести количество элементов в стриме +
- Вывести среднее арифметическое всех чисел в стриме +
         */
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(22);
        list.add(35);
        list.add(3);
        list.add(12);
        list.add(4);
        list.add(53);
        list.add(13);
        list.add(5);
        list.add(19);
        list.add(7);
        Stream stream = list.stream();
        list.stream().distinct().forEach(System.out::println);
        list.stream().filter(i -> i >= 7 && i <= 17 && i % 2 == 0).forEach(System.out::println);
        list.stream().map(i -> i * 2).forEach(System.out::println);
        list.stream().sorted().limit(4).forEach(System.out::println);
        System.out.println(list.stream().count());
        System.out.println(list.stream().mapToInt(i -> i).average());
    }
}




