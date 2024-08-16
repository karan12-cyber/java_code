import java.util.Scanner;

public class compound_intreast {
    public static void main(String[]args){
        float rate,principle,time;
        int n=12;
        System.out.println(" enter amount of principle:");
        System.out.println(" enter rate of the intreast");
        System.out.println("enter the time: ");
        Scanner sc= new Scanner(System.in);
        principle=sc.nextFloat();
        rate=sc.nextFloat();
        time=sc.nextFloat();
        float amount=principle+(0.5f+(+rate/n));
        System.out.println("the amount is:"+amount);
        System.out.println(Math.pow(amount, time));
        float ci=amount-principle;
        System.out.println("the compound intreast is:"+ci);
   }
    
}
