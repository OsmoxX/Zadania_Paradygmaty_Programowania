import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class SortingTest {
    public static void main(String[] args) {
        System.out.println(("Zadanie 1.2.4"));
        System.out.println("\n======Testy Sortowania======");


        testSort(new BubbleSort<>(), "Bubble Sort");
        testSort(new MergeSort<>(), "Merge Sort");
    }

    private static List<Person> createSampleList() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Jan", "Nowak", "12345678901", 19));
        people.add(new Person("Zbigniew", "Kowalski", "98765432109", 21));
        people.add(new Person("Anna", "Szymańska", "56789012345", 1));
        people.add(new Person("Maria", "Żaba", "11223344556", 51));
        return people;
    }
    private static void testSort(ISortingAlgorithm<Person> sorter, String sortname) {
        System.out.println("\nTest: " + sortname);
        List<Person> people = createSampleList();
        sorter.sort(people);


        if (people.get(0).getFirstName().equals("Anna") &&
                people.get(0).getLastName().equals("Szymańska") &&
                people.get(3).getFirstName().equals("Zbigniew") &&
                people.get(3).getLastName().equals("Kowalski")) {
            System.out.println(sortname + " działa poprawnie.");
        }else{
            System.out.println("Test nieudany dla" + sortname + "!");
        }
    }

}


