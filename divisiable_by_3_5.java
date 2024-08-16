import java.util.Scanner;

public class divisiable_by_3_5 {
    public static void main(String[]args){
        int a;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the a");
        a=sc.nextInt();
        
        if((a%3==0)&&(a%5==0)){
            System.out.println("a is bivisable by both");

        }else if(a%3==0){
            System.out.println("a is divisable by 3 only");

        }else if(a%5==0){
            System.out.println("a is divisable by 5 only");

        }else{
            System.out.println("a is not divisable by both ");

        }
    }
    
}
