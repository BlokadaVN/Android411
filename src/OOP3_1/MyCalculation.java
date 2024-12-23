package OOP3_1;

public class MyCalculation extends Calculation{

    // extends Calculation - класс  Calculation стал родительским.

    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("Произведение: " + z);
    }
}
