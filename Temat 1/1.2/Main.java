import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1.2.1 Sortowanie po wieku
        System.out.println("Zadanie 1.2.1:");
        List<Person> people = createSamplePersonList();
        System.out.println("Przed sortowaniem:");
        people.forEach(System.out::println);

        people.sort(Person.AGE_COMPARATOR); // Sortowanie po wieku

        System.out.println("\nPo sortowaniu po wieku:");
        people.forEach(System.out::println);
        System.out.println("\n");

        // 1.2.2 Sortowanie po imieniu i nazwisku
        System.out.println("Zadanie 1.2.2:");
        ISortingAlgorithm<Person> mergeSorter = new MergeSort<>();
        mergeSorter.sort(people);
        System.out.println("Po sortowaniu po imieniu i nazwisku:");
        people.forEach(System.out::println);
        System.out.println("\n");

        // 1.2.3 Porównanie Bubble Sort i Merge Sort
        System.out.println("Zadanie 1.2.3:");
        List<Person> bubbleSortList = new ArrayList<>(people);
        List<Person> mergeSortList = new ArrayList<>(people);

        ISortingAlgorithm<Person> bubbleSorter = new BubbleSort<>();
        bubbleSorter.sort(bubbleSortList);
        System.out.println("Bubble Sort:");
        bubbleSortList.forEach(System.out::println);

        mergeSorter.sort(mergeSortList);
        System.out.println("\nMerge Sort:");
        mergeSortList.forEach(System.out::println);
        System.out.println("\n");

        // 1.2.5 Sortowanie produktów po cenie
        System.out.println("Zadanie 1.2.5:");
        List<Product> products = createSampleProductList();
        System.out.println("Przed sortowaniem:");
        products.forEach(System.out::println);

        ISortingAlgorithm<Product> productSorter = new MergeSort<>();
        productSorter.sort(products);

        System.out.println("\nPo sortowaniu po cenie:");
        products.forEach(System.out::println);
        System.out.println("\n");
    }

    private static List<Person> createSamplePersonList() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Anna", "Nowak", "12345678901", 30));
        people.add(new Person("Jan", "Kowalski", "98765432109", 25));
        people.add(new Person("Anna", "Zielińska", "56789012345", 35));
        people.add(new Person("Piotr", "Adamski", "11122334455", 28));
        people.add(new Person("Jan", "Nowicki", "11223344556", 40));
        return people;
    }

    private static List<Product> createSampleProductList() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 4000));
        products.add(new Product("Telefon", 2500));
        products.add(new Product("Tablet", 1500));
        products.add(new Product("Monitor", 1000));
        products.add(new Product("Klawiatura", 300));
        return products;
    }
}