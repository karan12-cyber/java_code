import java.util.Scanner;

public class month_by_number {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number  month ");
        int s;
        s=sc.nextInt();
        if(s==1){
            System.out.println("january");

        }else if(s==2){
            System.out.println("february");

        }else if(s==3){
            System.out.println("march");

        }else if (s==4){
            System.out.println("april");

        }else if(s==5){
            System.out.println("may");

        }else if(s==6){
            System.out.println("june");

        }else if(s==7){
            System.out.println("july");

        }else if(s==8){
            System.out.println("august");
            
        }else if(s==9){
            System.out.println("september");

        }else if(s==10){
            System.out.println("october");

        }else if(s==11){
            System.out.println("november");

        }else if(s==12){
            System.out.println("december");

        }else{
            System.out.println("invalid");
        }

    }
    
}
