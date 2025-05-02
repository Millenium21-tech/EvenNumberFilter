public class Main {
    public static void main(String[] args) {
        import java.util.Arrays;
import java.util.Collections;
import java.util.List;

        public class Main {
            public static void main(String[] args) {
                // Test Case 1: Mixed even and odd numbers
                List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
                List<Integer> evenList1 = EvenNumberFilter.filterEvenNumbers(list1);
                System.out.println("Original List: " + list1);
                System.out.println("Even Numbers List: " + evenList1);
                System.out.println();

                // Test Case 2: Empty list
                List<Integer> list2 = Collections.emptyList();
                List<Integer> evenList2 = EvenNumberFilter.filterEvenNumbers(list2);
                System.out.println("Original List: " + list2);
                System.out.println("Even Numbers List: " + evenList2);
                System.out.println();

                // Test Case 3: Only odd numbers
                List<Integer> list3 = Arrays.asList(1, 3, 5, 7, 9);
                List<Integer> evenList3 = EvenNumberFilter.filterEvenNumbers(list3);
                System.out.println("Original List: " + list3);
                System.out.println("Even Numbers List: " + evenList3);
            }
        }

    }
}