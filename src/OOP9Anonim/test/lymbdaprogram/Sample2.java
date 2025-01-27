package OOP9Anonim.test.lymbdaprogram;

// В несколько строк в функции лямбды.

//interface Calc {
//    int calculate();
//}

interface Calc {
    int calculate(int x, int y);
}

public class Sample2 {

    static int x = 10;
    static int y = 20;

    public static void main(String[] args) {
//        Calc operation = () -> {
//            x = 30;
//            return x + y;
//        };
//        System.out.println(operation.calculate());

        Calc operation = (int a, int b) -> {
            if (b == 0) {
                return 0;
            } else {
                return a / b;
            }
        };
        System.out.println(operation.calculate(20, 10));
        System.out.println(operation.calculate(20, 0));
    }
}

