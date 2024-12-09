package DZoop1_Nenashev;

public class Auto {
    private String name;
    private int age;
    private String model;
    private String power;
    private String color;
    private int price;

    public Auto() {
    }

    public Auto(String name, int age, String model, String power, String color, int price) {
        this.name = name;
        this.age = age;
        this.model = model;
        this.power = power;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 0)
            this.price = price;
    }

    public void printInfo() {
        System.out.println("******* Данные автомобиля *******");
        System.out.println("Название модели: " + this.name);
        System.out.println("Год выпуска: " + this.age);
        System.out.println("Производитель: " + this.model);
        System.out.println("Мощность двигателя: " + this.power);
        System.out.println("Цвет машины: " + this.color);
        System.out.println("Цена: " + this.price);
        System.out.println("=================================");
    }
}
