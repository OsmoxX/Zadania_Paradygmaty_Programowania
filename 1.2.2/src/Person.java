public class Person implements IMyComparable<Person> {
    private final String firstName;
    private final String lastName;
    private final String pesel;

    // Konstruktor
    public Person(String firstName, String lastName, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
    }

    // Gettery
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPesel() {
        return pesel;
    }

    // Implementacja metody compareTo
    @Override
    public int compareTo(Person other) {
        int firstNameComparison = this.firstName.compareTo(other.firstName);
        if (firstNameComparison != 0) {
            return firstNameComparison;
        }
        return this.lastName.compareTo(other.lastName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + pesel + ")";
    }
}
