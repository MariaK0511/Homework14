package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        /*
        2. Создать коллекцию класса ArrayList со значениями имен всех студентов в группе
С помощью Stream'ов:
- Вернуть количество количество людей с вашим именем (вне зависимости от верхнего/нижнего регистра букв)+
- Выбрать все имена, начинающиеся на "а" (вне зависимости от верхнего/нижнего регистра букв)+
- Отсортировать и вернуть первый элемент коллекции или "Empty@, если коллекция пуста+
         */
        List<String> names = new ArrayList<>();
        names.add("Mike");
        names.add("Kate");
        names.add("Mary");
        names.add("Viktor");
        names.add("John");
        names.add("Anna");
        names.add("Alla");
        String myName = "mary";

        Stream stream = names.stream();
        System.out.println(names.stream().filter(name -> name.equalsIgnoreCase(myName)).count());
        names.stream().filter(name -> name.startsWith("A") && name.equalsIgnoreCase(name)).forEach(System.out::println);
        System.out.println(names.stream().sorted().findFirst().orElse("empty"));
    }
}
