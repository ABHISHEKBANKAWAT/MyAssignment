package LamdaExpression;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class question2 {
    private int totalPrice;
    private String status;

    public Question2(int totalPrice, String status) {
        this.totalPrice = totalPrice;
        this.status = status;
    }

    public static ArrayList<question2> listOfOrders(ArrayList<question2> orders) {

        // the dataType should be same of the predicate and the data on which predicate
        // is applied
        // order is -> question2 (Object)
        Predicate<question2> orderTotal = order -> order.totalPrice > 10000;
        Predicate<question2> orderStatus = order -> (order.status.equals("ACCEPTED")
                || order.status.equals("COMPLETED"));

        ArrayList<question2> validOrders = orders.stream().filter(orderTotal.and(orderStatus))
                .collect(Collectors.toCollection(ArrayList::new));

        return validOrders;
    }

    public static void main(String[] args) {

        ArrayList<question2> list = new ArrayList<>();
        list.add(new question2(10001, "COMPLETED"));
        list.add(new question2(10002, "ACCEPTED"));
        list.add(new question2(10003, "COMPLETE"));
        list.add(new question2(1000, "ACCEPTED"));
        list.add(new question2(10005, "COMPLETED"));

        ArrayList<question2> validList = listOfOrders(list);

        for (question2 order : validList) {
            System.out.println(order.totalPrice + "  " + order.status);
        }
    }
}