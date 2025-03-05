public class Implementacja_proceduralna_sortowania_list_liczb {
    public static class BubbleSort {
        public static void bubbleSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

        public static void main(String[] args) {
            int[] numbers = {64, 34, 25, 12, 22, 11, 90};

            bubbleSort(numbers);

            System.out.print("Posortowana lista: ");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
        }
    }

}
