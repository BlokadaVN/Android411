package OOP3_1.Person;

public class Teacher extends Human {
    private String speciality;
    private double rating;

    public Teacher(int age, String firstName, String lastName, String speciality, double rating) {
        super(age, firstName, lastName);
        setSpeciality(speciality);
        setRating(rating);
        System.out.println("Teacher Constructor\t" + Integer.toHexString(hashCode()));

    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return super.toString() + " Teacher{" +
                "speciality='" + speciality + '\'' +
                ", rating=" + rating +
                '}';
    }
}
