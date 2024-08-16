import java.util.Scanner;
import java.util.Stack;
public class method_of_stack {
    public static void main(String[] args) {
        Stack<Integer>s= new Stack<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the range");
        int n=sc.nextInt();
         System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            s.push(sc.nextInt());

        }
        System.out.println("Stack: " + s);
        sc.close();
        System.out.println(s.push(10));
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.empty());
        System.out.println(s.search(50));



        
    }
}
    

