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
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            randomNum.add(random.nextInt(20));
        }
        randomNum.stream().distinct().forEach(System.out::println);
        randomNum.stream().filter(i -> i >= 7 && i <= 17 && i % 2 == 0).forEach(System.out::println);
        randomNum.stream().map(i -> i * 2).forEach(System.out::println);
        randomNum.stream().sorted().limit(4).forEach(System.out::println);
        System.out.println(randomNum.stream().count());
        System.out.println(randomNum.stream().mapToDouble(i -> i).average());
    }
}




