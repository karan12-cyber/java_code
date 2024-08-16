
import java.util.Scanner;

public class Sum_of_even_number {
    public static void  main(String[]args){
        int end;
           int sum=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number of elements");
         end=sc.nextInt();
         for (int i = 1; i < end; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
                
        }
        System.out.println("The sum of even numbers from " + 1 + " to " + end+ " is " + sum);
    }
    
}
 

        
// import java.util.Scanner;

// public class SumOfEvenNumbers {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the start of the range: ");
//         int start = scanner.nextInt();

//         System.out.print("Enter the end of the range: ");
//         int end = scanner.nextInt();

//         int evenSum = 0;
//         for (int i = start; i <= end; i++) {
//             if (i % 2 == 0) {
//                 evenSum += i;
//             }
//         }

//         System.out.println("The sum of even numbers from " + start + " to " + end + " is " + evenSum);
//     }
// }           

             