
import java.util.HashMap;
import java.util.Scanner;

public class method_of_hashmap {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer>k=new HashMap<Integer,Integer>();
        System.out.println("Enter the range of hashmap");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter key: ");
            int key = sc.nextInt();
            System.out.print("Enter value: ");
            int value = sc.nextInt();
            k.put(key, value);
        }
        System.out.println("HashMap: " + k);   
        System.out.println(k.clone());
        System.out.println(k.put(2,4 ));
        System.out.println(k.containsKey(k));
        System.out.println(k.containsValue(n));
        System.out.println(k.size());
        System.out.println(k.replace(2,4));
        System.out.println(k.isEmpty());
        k.clear();
        
    }
}   
    

