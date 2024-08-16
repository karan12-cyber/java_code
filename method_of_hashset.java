import java.util.HashSet;
import java.util.Scanner;

public class method_of_hashset {
    public static void main(String[] args) {
        HashSet<Integer>k=new HashSet<Integer>();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the range of hashset");
        int n=sc.nextInt();
        System.out.println("enter the values ");
        for (int i = 0; i < n; i++) {
            k.add(sc.nextInt());   
        }
        System.out.println("The hashset is"+k);
        System.out.println(k.add(10));
        System.out.println(k.clone());
        System.out.println(k.contains(20));
        System.out.println(k.remove(10));
        System.out.println(k.size());
        System.out.println(k.containsAll(k));
        System.out.println(k.isEmpty());
        System.out.println(k.removeAll(k));
    
    }
}
    

