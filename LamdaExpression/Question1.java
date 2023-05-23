package LamdaExpression;

@FunctionalInterface
interface Operation {
    double operate(int num1, int num2);
}

public class question1 {
    public double addition(int num1, int num2) {
        Operation obj = (int a, int b) -> a + b;
        return obj.operate(num1, num2);
    }

    public double subtraction(int num1, int num2) {
        Operation obj = (int a, int b) -> a - b;
        return obj.operate(num1, num2);
    }

    public double multiplication(int num1, int num2) {
        Operation obj = (int a, int b) -> a * b;
        return obj.operate(num1, num2);
    }

    public double division(int num1, int num2) {
        Operation obj = (int a, int b) -> a / (double) b;
        return obj.operate(num1, num2);
    }

    public static void main(String[] args) {

        int num1 = 4;
        int num2 = 2;

        question1 obj = new question1();

        System.out.println(obj.addition(num1, num2));
        System.out.println(obj.subtraction(num1, num2));
        System.out.println(obj.multiplication(num1, num2));
        System.out.println(obj.division(num1, num2));

    }
}