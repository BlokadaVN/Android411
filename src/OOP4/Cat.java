package OOP4;

public class Cat extends Animal {

        // Это совершенно другой метод, так как есть передаваемые параметры в виде String.
    public void voice(String name) {
        System.out.println(name + "Мяу!");
    }

    // А это ПЕРЕОПРЕДЕЛЕННЫЙ метод из родительского класса Animal.
    @Override
    public void voice() {
        super.voice();
    }
}
