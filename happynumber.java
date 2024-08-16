import java.util.Scanner;
public class happynumber {public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
         int temp=num;
         while(num>9){
             int sum = 0;
            while(num>0){
                int d=num%10;
                sum+=d*d;
                num=num/10;
            }
            num=sum;
            
            
            }
                if(num==1){
                    System.out.println(temp+" is a happy number");
    
                }else{
                    System.out.println(temp+"not a happy number");
                }
         }
     }
  


    
