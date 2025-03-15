import java.util.Comparator;

public class Person implements IMyComparable<Person> {
    private final String firstName;
    private final String lastName;
    private final String pesel;
    private final int age;

    // Konstruktor
    public Person(String firstName, String lastName, String pesel, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.age = age;
    }

    // Gettery
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getPesel() { return pesel; }
    public int getAge() { return age; }

    // Implementacja compareTo dla sortowania najpierw po imieniu, potem po nazwisku
    @Override
    public int compareTo(Person other) {
        int firstNameComparision = this.firstName.compareTo(other.firstName);
        if (firstNameComparision != 0) {
            return firstNameComparision;

        }
        return this.lastName.compareTo(other.lastName);
    }
    public static final Comparator<Person> AGE_COMPARATOR = Comparator.comparingInt(Person::getAge);

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + pesel + "), Wiek: " + age;
    }
}