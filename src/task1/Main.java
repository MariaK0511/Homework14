package task1;

import java.util.*;


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
        List<Integer> randomNum = new ArrayList<>();
        randomNum.add(1);
        randomNum.add(2);
        randomNum.add(1);
        randomNum.add(22);
        randomNum.add(35);
        randomNum.add(3);
        randomNum.add(12);
        randomNum.add(4);
        randomNum.add(53);
        randomNum.add(13);
        randomNum.add(5);
        randomNum.add(19);
        randomNum.add(7);
        randomNum.stream().distinct().forEach(System.out::println);
        randomNum.stream().filter(i -> i >= 7 && i <= 17 && i % 2 == 0).forEach(System.out::println);
        randomNum.stream().map(i -> i * 2).forEach(System.out::println);
        randomNum.stream().sorted().limit(4).forEach(System.out::println);
        System.out.println((long) randomNum.size());
        System.out.println(randomNum.stream().mapToInt(i -> i).average());
    }
}




