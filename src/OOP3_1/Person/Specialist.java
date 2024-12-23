package OOP3_1.Person;

public class Specialist extends Graduate {

    private int estimation;

    public Specialist(int age, String firstName, String lastName, String speciality, String group, double rating, double attendance, String subject, int estimation) {
        super(age, firstName, lastName, speciality, group, rating, attendance, subject);
        this.estimation = estimation;
    }


    // Конструктор копирования для new Specialist(graduate,5); ** Main 24 строка.
    public Specialist(Graduate graduate, int estimation) {
        super(graduate);
        this.estimation = estimation;
    }


    public int getEstimation() {
        return estimation;
    }

    public void setEstimation(int estimation) {
        this.estimation = estimation;
    }

    @Override
    public String toString() {
        return super.toString() + " Specialist{" +
                "estimation=" + estimation +
                '}';
    }
}
