package Task2;

import java.util.LinkedList;

public class Animals {
    private static LinkedList<String> animals = new LinkedList<>();

    public static void addAnimal(String animal) {
        if (!animals.contains(animal)) {
            animals.addLast(animal);
        } else {
            System.out.println("Такое животное уже добавлено!");
        }
        showCollectionInstance();
    }

    public static void deleteAnimal() {
        if (!animals.isEmpty()) {
            animals.removeFirst();
            showCollectionInstance();
        } else {
            System.out.println("Коллекция пуста!");
        }
    }

    public static void showCollectionInstance() {
        System.out.println(animals);
    }

}
