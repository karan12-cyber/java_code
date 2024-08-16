import java.util.Scanner;

public class automorphaic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int c =num;
        double square=Math.pow(num,2);
        int d=0;
        while(num>0){
            num /=10;
            d++;
        }

        if(c == square%((int)Math.pow(10, d))){
            System.out.println("Automorphic");
            }else{
            System.out.println("Not Automorphic");

        }

    }
       
        //        if (d==num){
        //           System.out.println("the number is automorphic");

        //     }
        //        else {
        //             System.out.println("the number is not automorphic");
        // }


    }



         
         




