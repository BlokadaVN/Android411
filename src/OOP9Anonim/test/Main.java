package OOP9Anonim.test;

// Анонимный класс с интерфейсом.


interface CalcInterface {
    int calculate(int a, int b);
}

//public class Main {
//    public static void main(String[] args) {
//        int x = 5, y = 3;
//
//        CalcInterface sum = (a, b) -> (a + b);
//        CalcInterface sub = (a, b) -> (a - b);
//        CalcInterface mul = (a, b) -> (a * b);
//
//        int res = sum.calculate(x, y);
//        int res2 = sub.calculate(x, y);
//        int res3 = mul.calculate(x, y);
//        System.out.println(res);
//        System.out.println(res2);
//        System.out.println(res3);
//    }
//}

//interface CalcInterface {  // Функциональный интерфейс.
//    void calculate(int a, int b);
//}
//
/// /class Calc implements CalcInterface {
/// /    @Override
/// /    public void calculate(int a, int b) {
/// /        System.out.println(a + b);
/// /    }
/// /}
//
//public class Main {
//    public static void main(String[] args) {
//        int x = 5, y = 3;
/// /        CalcInterface sum = new Calc();
//
/// /        CalcInterface sum = new CalcInterface() {
/// /            @Override
/// /            public void calculate(int a, int b) {
/// /                System.out.println(a + b);
/// /            }
/// /        };
//
//        CalcInterface sum = (a, b) -> System.out.println(a + b);
//
//        sum.calculate(x, y);
//    }
//}


// Анонимный класс.
public class Main {
    public static void main(String[] args) {
        int x = 5, y = 3;
        Calc sum = new Calc();
        sum.calculate(x, y);

//       CalcElse mul = new CalcElse();
//        mul.calculate(x, y);

        Calc mul = new Calc() { // Анонимный класс.
            @Override
            public void calculate(int a, int b) {
                System.out.println(a * b);
            }
        };
        mul.calculate(x, y);
    }
}

class Calc {
    public void calculate(int a, int b) {
        System.out.println(a + b);
    }
}

//class CalcElse extends Calc {
//    @Override
//    public void calculate(int a, int b) {
//        System.out.println(a * b);
//    }
