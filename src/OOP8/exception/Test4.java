package OOP8.exception;

public class Test4 {
    public static void main(String[] args) {
        try {
            ex();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace(); // Выдает ошибку в консоль. java.lang.RuntimeException: Hello Exception!
//            at OOP8.exception.Test4.ex(Test4.java:16)
//            at OOP8.exception.Test4.main(Test4.java:6)

        }
    }

    public static void ex() throws RuntimeException {

        throw new RuntimeException("Hello Exception!");
    }
}
