package Streams;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Trader {
    private String name;
    private String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "name=" + name +
                ", city=" + city +
                '}';
    }
}

public class Question3 {

    public static List<String> printUniqueCities(List<Trader> traders) {
        return traders.stream().map(Trader::getCity).distinct().collect(Collectors.toCollection(ArrayList::new));
    }

    public static List<String> tradersFromPuneSortByName(List<Trader> traders) {
        Predicate<Trader> traderFromPune = trader -> trader.getCity().toLowerCase().equals("pune");
        return traders.stream().filter(traderFromPune).sorted((t1, t2) -> t1.getName().compareTo(t2.getName()))
                .map(Trader::getName).collect(Collectors.toCollection(ArrayList::new));
    }

    public static String allTrader3Names(List<Trader> traders) {
        List<String> traderNames = traders.stream().map(Trader::getName)
                .sorted((name1, name2) -> name1.compareTo(name2)).collect(Collectors.toCollection(ArrayList::new));

        StringBuilder sb = new StringBuilder();
        for (String name : traderNames) {
            sb.append(name);
        }
        return sb.toString();
    }

    public static ArrayList<Trader> areAnyTradersFromIndore(ArrayList<Trader> traders) {
        Predicate<Trader> traderFromPune = trader -> trader.getCity().toLowerCase().equals("indore");
        return traders.stream().filter(traderFromPune).collect(Collectors.toCollection(ArrayList::new));
    }

    public static void main(String[] args) {

        ArrayList<Trader> traders = new ArrayList<>();
        traders.add(new Trader("Ram", "Indore"));
        traders.add(new Trader("Shyam", "Pune"));
        traders.add(new Trader("Rakesh", "Indore"));
        traders.add(new Trader("John", "Pune"));
        traders.add(new Trader("Jane", "Mumbai"));

        // What are all the unique cities where the traders work?
        List<String> uniqueCities = printUniqueCities(traders);
        System.out.println("Unique Cities : " + uniqueCities);

        // Find all traders from Pune and sort them by name
        List<String> tradersNames = tradersFromPuneSortByName(traders);
        System.out.println("Traders Names from Pune : " + tradersNames);

        // Return a string of all traders’ names sorted alphabetically.
        String name = allTrader3Names(traders);
        System.out.println("Traders Names : " + name);

        // Are any traders based in Indore
        ArrayList<Trader> tradersFomIndore = areAnyTradersFromIndore(traders);
        System.out.println("Traders from Indore : " + tradersFomIndore);
    }

}