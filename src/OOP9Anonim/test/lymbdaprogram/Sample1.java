package OOP9Anonim.test.lymbdaprogram;

interface Printable {
    //    void print(String s, String t);
    void print();
}

public class Sample1 {
    public static void main(String[] args) {

//        // С двумя параметрами.
//        Printable printable = (n, m) -> System.out.println(n + m);
//        printable.print("Hello,", " Java!");

        // Без параметров.
        Printable printable = () -> System.out.println("Hello, Java!");
        printable.print();
    }
}
