package OOP2.rand;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();


        // Рандом.
        int min = 5, max = 10;
        int cnt = 30;
        for (int i = 0; i < cnt; i++) {
//            System.out.println(rand.nextBoolean()); 
//            System.out.println(rand.nextDouble());
//            System.out.println(rand.nextInt(max)); // от 0 до max не включая 10
//            System.out.println(rand.nextInt(max - min) + min); // от min до max не включая 10
            System.out.println(rand.nextInt(max - min + 1) + min); // от min до max - включая 10
        }
    }
}