import java.util.Scanner;
public class switch_case_operator {
    public static void main(String[] args) {
        int num1,num2;
        char operator ;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num1:");
        System.out.println("enter the num2:");
        System.out.println("enter the operator:");
        num1=sc.nextInt();
        num2=sc.nextInt();
        // operator=sc.nextchar();
        operator = sc.next().charAt(0);
        switch(operator){
            case '+':
            System.out.println("addition of two numbers is:"+(num1+num2));
            break;
            case '-':
            System.out.println("subtraction of two numbers is:"+(num1-num2));
            break;
            case '*':
            System.out.println("multiplication of two numbers is:"+(num1*num2));
            break;
            case '/':
            System.out.println("division of two numbers is:"+(num1/num2));
            default:
            System.out.println("invalid operator");


        }

    }
    
}
