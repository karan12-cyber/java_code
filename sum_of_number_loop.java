import java.util.Scanner;

public class sum_of_number_loop {
    public static void main(String[]args){
        int num;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        int count=0;
        int sum=0;
        while(num>0){
            int d=num%10;
            sum+=d;
            num=num/10;
            count++;
            
            
        }
             System.out.println("Sum of digits of the number is "+sum);
             


    }
    
}
            

// import java.util.Scanner;

// public class AdditionUsingWhileLoop {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the number of numbers to add: ");
//         int numCount = scanner.nextInt();

//         int sum = 0;
//         int i = 0;

//         while (i < numCount) {
//             System.out.print("Enter number " + (i + 1) + ": ");
//             int num = scanner.nextInt();
//             sum += num;
//             i++;
//         }

//         System.out.println("The sum of the numbers is: " + sum);
//     }
// }  




    
