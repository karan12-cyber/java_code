import java.util.HashMap;
import java.util.Scanner;

public class Question_of_hashmap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,String>Data=new HashMap<String,String>();
        System.out.println("Enter the range of hashmap");
        int num=sc.nextInt();
        for (int i = 0; i < num; i++) {
           System.out.println("Enter the key");
           String key=sc.next();
           System.out.println("Enter the value");
           String value=sc.next(); 
           Data.put(key, value); 
        }
        System.out.println("the data is"+ Data);
        System.out.println("Enter the key for finding the value");
        String Search=sc.next();
        System.out.println(Data.get(Search));
    }
    
}
