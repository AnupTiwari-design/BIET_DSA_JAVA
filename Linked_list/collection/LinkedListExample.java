package Linked_list.collection;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList of integers
        LinkedList<Integer> list = new LinkedList<>();

        // Insert at the end
        list.add(10);
        list.add(20);
        list.add(30);

        // Insert at the beginning
        list.addFirst(5);

        // Insert at a specific position (index)
        list.add(2, 15); // index 2, value 15

        // Display the list
        System.out.println("LinkedList: " + list);

        // Access elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        // Remove from beginning
        list.removeFirst();

        // Remove from end
        list.removeLast();

        // Remove at index
        list.remove(1);

        // Display after deletions
        System.out.println("After deletions: " + list);

        // Iterate through the list
        System.out.print("Using for-each: ");
        for (int val : list) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}