package DZoop4_Nenashev;

public class Aspirant extends Student {
    public String tema;

    public Aspirant(String fistName, String endName, String group, String tema, int a) {
        super(fistName, endName, group, a);
        this.tema = tema;
    }

    @Override
    public void sout() {
        super.sout();
        System.out.print(", тема: " + tema + ",");
    }

    @Override
    public int sum() {
        return super.sum() * 2;
    }
}
