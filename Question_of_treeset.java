import java.util.Scanner;
import java.util.TreeSet;

public class Question_of_treeset {
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       TreeSet<String>name=new TreeSet<String>();
       System.out.println("Enter the range of treeset ");
       int n=sc.nextInt();
       System.out.println("Enter the name ");
       for (int i = 0; i < n; i++) {
           name.add(sc.next());
        }
        
    System.out.println("The hashset is"+ name); 
    int i=1;
    for(String k:name){
        System.out.println("roll no"+ i);
        System.out.println(k);
        i++;
    }
 }
    
}
