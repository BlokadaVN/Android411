package OOP3_1.Person;

public class Graduate extends Student {
    private String subject;

    public Graduate(int age, String firstName, String lastName, String speciality, String group, double rating, double attendance, String subject) {
        super(age, firstName, lastName, speciality, group, rating, attendance);
//        this.subject = subject;

        setSubject(subject);
        System.out.println("Graduate Constructor\t" + Integer.toHexString(hashCode()));
    }

    public Graduate(Student student, String subject) {
        super(student);
        setSubject(subject);
        System.out.println("Graduate CopyConstructor\t" + Integer.toHexString(hashCode()));
    }

    public Graduate(Graduate other) {
        super(other);
        this.subject = other.subject;
    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString() + " Graduate{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
