import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tworzenie listy osób
        List<Person> people = new ArrayList<>();
        people.add(new Person("Anna", "Nowak", "12345678901"));
        people.add(new Person("Jan", "Kowalski", "98765432109"));
        people.add(new Person("Anna", "Zielińska", "56789012345"));
        people.add(new Person("Piotr", "Adamski", "11122334455"));
        people.add(new Person("Jan", "Nowicki", "11223344556"));

        // Sortowanie
        System.out.println("Przed sortowaniem:");
        people.forEach(System.out::println);

        Sorter.bubbleSort(people);

        System.out.println("\nPo sortowaniu:");
        people.forEach(System.out::println);
    }
}
