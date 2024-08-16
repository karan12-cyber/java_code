import java.util.Scanner;


public class perfect_number {
    public static void main(String[] args) {
        int num;
        int sum=0;
        int count=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number ");
        num=sc.nextInt();
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
             
        
            }     

               
        }
              if (sum==num){
                System.out.println("The number is a perfect number");
            }
              else{
                System.out.println("The number is not a perfect number");
        }


    }
    
}
