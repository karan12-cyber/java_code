import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class queue_question {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of persons");
    int n=sc.nextInt();
    Queue<String>passenger=new LinkedList<String>();
    Queue<String>bus1=new LinkedList<String>();
    Queue<String>bus2=new LinkedList<String>();
    Queue<String>bus3=new LinkedList<String>();
    System.out.println("Enter the name of person");
    for(int i=0;i<n;i++){
        passenger.add(sc.next());
    }
    System.out.println("queue: " + passenger);
    int size=passenger.size();
     for(int j=0;j<size/3;j++){
       bus1.add(passenger.remove());
       bus2.add(passenger.remove());
       bus3.add(passenger.remove());
       
      }
      System.out.println("queue: " + bus1);
      System.out.println("queue: " + bus2);
      System.out.println("queue: " + bus3);
     if (passenger.isEmpty()){
       if(passenger.size()==1){
         passenger.add(passenger.remove());
         
         
        }else{
          bus1.add(passenger.remove());
          bus2.add(passenger.remove());
        } 
      
          
    }
  }
}
