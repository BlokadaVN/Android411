package DZoop4_Nenashev;

public class Student {

    private String fistName;
    private String endName;
    private String group;
    private int a;
    private int sum;

    public Student(String fistName, String endName, String group, int a) {
        this.fistName = fistName;
        this.endName = endName;
        this.group = group;
        this.a = a;
    }


    public int sum() {
        if (a >= 4 && a <= 5) {
            sum = 1000;
        } else if (a < 4)
            sum = 800;
        return sum;
    }

    public void sout() {

        System.out.print(fistName + " " + endName + ", группа: " + group + " ");

    }

    public void step(){
        System.out.println(" сумма стипендии: " + sum());
    }
}
