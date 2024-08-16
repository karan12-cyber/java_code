import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class queve_method {
    public static void main (String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the  range of queve ");
        int n=sc.nextInt();
        Queue<Integer>s=new LinkedList <Integer>();
        System.out.println("Enter the values");
        for (int i=0;i<n;i++){
            s.add(sc.nextInt());
            System.out.println("queve: " + s);
        }
        System.out.println(s.add(60));
        System.out.println(s.peek());
        System.out.println(s.remove(10));
        System.out.println(s.size());
        System.out.println(s.isEmpty());
        System.out.println("Queue:"+s);
    }    
}
