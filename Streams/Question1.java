package Streams;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Fruit {
    private String name;
    private String color;
    private int calorie;
    private int price;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getCalorie() {
        return calorie;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Fruit(String name, String color, int calorie, int price) {
        this.name = name;
        this.color = color;
        this.calorie = calorie;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{ name='" + name +
                "', color='" + color +
                "', calorie=" + calorie +
                ", price=" + price +
                '}';
    }
}

public class Question1 {

    public static List<String> reverseSort(ArrayList<Fruit> fruits) {
        Predicate<Fruit> lessCalories = fruit -> fruit.getCalorie() < 100;
        return fruits.stream().filter(lessCalories).sorted((f1, f2) -> f2.getCalorie() - f1.getCalorie())
                .map(Fruit::getName).collect(Collectors.toList());
    }

    public static ArrayList<Fruit> sort(ArrayList<Fruit> fruits) {
        return fruits.stream().sorted(new Comparator<Fruit>() {
            @Override
            public int compare(Fruit f1, Fruit f2) {
                return f1.getColor().compareTo(f2.getColor());
            }
        }).collect(Collectors.toCollection(ArrayList::new));
    }

    public static ArrayList<Fruit> filterRedSortPrice(ArrayList<Fruit> fruits) {
        Predicate<Fruit> redFruit = fruit -> fruit.getColor().toLowerCase().equals("red");
        return fruits.stream().filter(redFruit).collect(Collectors.toCollection(ArrayList::new));
    }

    public static void main(String[] args) {

        ArrayList<Fruit> fruitsList = new ArrayList<>();
        fruitsList.add(new Fruit("Mango", "Yellow", 200, 100));
        fruitsList.add(new Fruit("Apples", "Red", 100, 80));
        fruitsList.add(new Fruit("Grapes", "Green", 40, 80));
        fruitsList.add(new Fruit("Pomegranate", "Red", 80, 80));

        System.out.println("Fruits with calories < 100");
        List<String> lessCaloriesFruits = reverseSort(fruitsList);
        System.out.println(lessCaloriesFruits);

        System.out.println("Fruits displayed Color wise");
        ArrayList<Fruit> fruits = sort(fruitsList);
        System.out.println(fruits);

        System.out.println("Fruits which are RED in color");
        ArrayList<Fruit> redColorFruits = filterRedSortPrice(fruitsList);
        System.out.println(redColorFruits);

    }
}