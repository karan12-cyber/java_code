import java.util.Scanner;
public class armstrong_number {
    public static void main(String[]args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        int temp=num;
        int sum=0;
        while(temp!=0){
            int digit=temp%10;
            sum=sum+(digit*digit*digit);
            temp=temp/10;
            }
            if(sum==num){

                System.out.println("Armstrong number");
             } else{
                    System.out.println("Not an Armstrong number");
    
            }
    }
    
}
