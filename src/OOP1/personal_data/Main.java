package OOP1.personal_data;

public class Main {
    public static void main(String[] args) {

        Human h1 = new Human("Юля", "23.05.1983", "44-46-98", "Россия", "Барнаул", "Матросова 3");
        h1.printInfo();
        h1.setName("Юлия");
        System.out.println(h1.getName());


    }
}
