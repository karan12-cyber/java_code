import java.util.Scanner;
public class switch_case {
    public static void main(String[]args){
        int day;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day");
        day=sc.nextInt();
        switch(day%7){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("friday");
            break;
            case 6:
            System.out.println("saturday");
            case 0:
            System.out.println("sunday");
            break;
            default:
            System.out.println("wrong");

        }


    }
    
}
