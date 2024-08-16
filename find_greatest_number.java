import java.util.Scanner;

public class find_greatest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for a: ");
        System.out.println("Enter the number for b: ");
        System.out.println("Enter the number for c: ");
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if ((a>b)&&(a>c)){
            System.out.println("a is the greatest number");

        }else if ((b>a)&&(b>c)){
            System.out.println("b is the greatest number");

        }else if ((c>a)&&(c>b)){
            System.out.println("c is the greatest number");

        }else if((a==b)&&(b==c)){
            System.out.println("all number are equal");

        }else{
            System.out.println("invalid input");
        }



}
}