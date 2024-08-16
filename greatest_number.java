import java.util.Scanner;

public class greatest_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number a: ");
        System.out.println("enter the number b:");
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b){
            System.out.println("the greatest number is:"+a);

        }else if(b>a){
            System.out.println("the greatest number is: "+b);

        }else{
            System.out.println("both number is equal");
        }
    
    }
}
    

