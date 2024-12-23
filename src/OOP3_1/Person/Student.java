package OOP3_1.Person;

public class Student extends Human {
    private String speciality;
    private String group;
    private double rating;
    private double attendance;

    public Student(int age, String firstName, String lastName, String speciality, String group, double rating, double attendance) {
        super(age, firstName, lastName);
//        this.speciality = speciality;
//        this.group = group;
//        this.rating = rating;
//        this.attendance = attendance;
        setSpeciality(speciality);
        setGroup(group);
        setRating(rating);
        setAttendance(attendance);
        System.out.println("Student Constructor\t" + Integer.toHexString(hashCode()));
    }

    public Student(Human human, String speciality, String group, double rating, double attendance) {
        super(human);
        setSpeciality(speciality);
        setGroup(group);
        setRating(rating);
        setAttendance(attendance);
        System.out.println("Student CopyConstructor\t" + Integer.toHexString(hashCode()));
    }

    // Конструктор копирования Graduate
    public Student(Student other) {
        super(other);
        this.speciality = other.speciality;
        this.group = other.group;
        this.rating = other.rating;
        this.attendance = other.attendance;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getAttendance() {
        return attendance;
    }

    public void setAttendance(double attendance) {
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return super.toString() + " Student{" +
                "speciality='" + speciality + '\'' +
                ", group='" + group + '\'' +
                ", rating=" + rating +
                ", attendance=" + attendance +
                '}';
    }
}
