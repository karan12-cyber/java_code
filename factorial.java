import java.util.Scanner;
public class factorial {
    public static void main(String[]args){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        long factorial=1;
        for(int i=1;i<=num;i++){
            factorial*=i;
        }
        System.out.println("Factorial of "+num+" is "+factorial);
    }
}
    
