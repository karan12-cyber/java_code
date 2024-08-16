import java.util.Scanner;

public class length_of_number {
    public static void main(String[]args){
        int num;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        int count=0;
        while(num>0){

            num=num/10;
            count++;

        }
           System.out.println(count);


    }
    
}
