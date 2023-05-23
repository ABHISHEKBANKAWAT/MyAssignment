package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
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
        return "Trader(name=" + name + ", city=" + city + ')';
    }
}

class Transaction {
    private Trader trader;
    private int year;
    private int value;

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public int getYear() {
        return year;
    }

    public int getValue() {
        return value;
    }

    public Trader getTrader() {
        return trader;
    }

    public void setTrader(Trader trader) {
        this.trader = trader;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Transaction{" + trader + ", year=" + year + ", value=" + value + '}';
    }
}

public class Question4 {

    public static List<Transaction> sortTransactions(List<Transaction> transactions) {

        Predicate<Transaction> transactionFrom2011 = transaction -> transaction.getYear() == 2011;

        return transactions.stream().filter(transactionFrom2011).sorted(new Comparator<Transaction>() {
            @Override
            public int compare(Transaction o1, Transaction o2) {
                if (o1.getValue() > o2.getValue()) {
                    return 1;
                }
                if (o1.getValue() < o2.getValue()) {
                    return -1;
                }
                return 0;
            }
        }).collect(Collectors.toList());
    }

    public static List<Integer> transactionsValuesDelhi(List<Transaction> transactions) {
        Predicate<Transaction> traderFromDelhi = transaction -> transaction.getTrader().getCity().toLowerCase()
                .equals("delhi");
        return transactions.stream().filter(traderFromDelhi).map(Transaction::getValue).collect(Collectors.toList());
    }

    public static int highestTransaction(List<Transaction> transactions) {
        Optional<Integer> value = transactions.stream().map(Transaction::getValue).max((o1, o2) -> o1 - o2);
        if (value.isPresent()) {
            return value.get();
        }
        return 0;
    }

    public static int smallestTransaction(List<Transaction> transactions) {
        Optional<Integer> value = transactions.stream().map(Transaction::getValue).min((o1, o2) -> o1 - o2);
        if (value.isPresent()) {
            return value.get();
        }
        return 0;
    }

    public static void main(String[] args) {

        List<Transaction> transactionList = new ArrayList<>();
        transactionList.add(new Transaction(new Trader("John", "Delhi"), 2011, 10000));
        transactionList.add(new Transaction(new Trader("Jane", "Indore"), 2011, 20000));
        transactionList.add(new Transaction(new Trader("Ram", "Delhi"), 2022, 40000));
        transactionList.add(new Transaction(new Trader("Shyam", "Mumbai"), 2021, 50000));

        // Find all transactions in the year 2011 and sort them by value (small to
        // high).
        List<Transaction> transactionsFrom2011 = sortTransactions(transactionList);
        System.out.println("Transactions from 2011 : " + transactionsFrom2011);

        // Print all transactions’ values from the traders living in Delhi
        List<Integer> transactionsFromDelhi = transactionsValuesDelhi(transactionList);
        System.out.println("Transactions of Traders from Delhi : " + transactionsFromDelhi);

        // What’s the highest value of all the transactions?
        int highestTransaction = highestTransaction(transactionList);
        System.out.println("Highest Transaction : " + highestTransaction);

        // Find the transaction with the smallest value.
        int smallestTransaction = smallestTransaction(transactionList);
        System.out.println("Smallest Transaction : " + smallestTransaction);

    }
}