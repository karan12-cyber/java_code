import java.util.Scanner;
import java.util.Stack;
public class stack_Question {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range of stack ");
        Stack<String>book=new Stack<String>();
        Stack<String>book2=new Stack<String>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the name");
            book.push(sc.next());
        } 
        System.out.println("Stack: " + book);
        // sc.close();
        String name;
        System.out.println("Which book you want to read");
        name=sc.next();

        while(n>0){
            if(book.peek().equals(name)){
                book.pop();
                break;
            }else{
                book2.push(book.pop());
            }
            n--;
        }
        System.out.println("BOOK2");
        book2.forEach(i->System.out.println(i));

        System.out.println("BOOK in your hand : "+name);
        System.out.println("BOOKS");
        book.forEach(i->System.out.println(i));

        
    }
    
}




        
            
        
    
        

            
    





    

