package lambdaExpression_assignment;

import java.util.ArrayList;
import java.util.function.Predicate;

public class question4 {
    public static ArrayList<String> removeOddLength(ArrayList<String> list) {

        Predicate<String> oddLength = str -> str.length() % 2 != 0;

        list.removeIf(oddLength);
        return list;
    }

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        arrayList.add("four");
        arrayList.add("five");
        arrayList.add("six");

        System.out.println(arrayList);

        ArrayList<String> newArrayList = removeOddLength(arrayList);
        System.out.println(newArrayList);

    }
}