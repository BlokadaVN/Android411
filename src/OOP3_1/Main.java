package OOP3_1;

public class Main {
    public static void main(String[] args) {
        // Наследование.

        int a = 20;
        int b = 10;
//        Calculation calc = new Calculation(); // вызов родительского класса.
        MyCalculation calc = new MyCalculation(); // вызов дочернего (класса наследника) класса. Если вызывать родительский класс, то не будет видно, что в дочернем, поэтому мы вызываем MyCalculation.
        calc.addition(a, b);
        calc.subtraction(a, b);
        calc.multiplication(a,b);
    }
}
