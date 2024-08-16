import java.util.Scanner;

public class whilel_loop {
    public static void main(String[]args){
        int i =1;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number of times you want to execute the loop");
        int sum =0;
        while(i!=0){
            
            System.out.println("enter the loop again");
            i=sc.nextInt();
            sum=sum+i;

        }
        System.out.println("sum of the numbers is "+sum);

              
    }
            
}    
    


