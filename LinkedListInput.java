import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListInput {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        System.out.println("Linked List: " + list);
        scanner.close();
        System.out.println(list.add(10));
        list.addFirst(50);
        list.addLast(10);
        System.out.println(list.size());
        System.out.println(list.clone());
        System.out.println(list.contains(10));
        System.out.println(list.get(5));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.indexOf(20));
        System.out.println(list.lastIndexOf(40));
        System.out.println(list.pop());
        System.out.println(list.remove(2));
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list.toArray());
        System.out.println(list.toString());
        list.clear();





        

         
    }
    

}
