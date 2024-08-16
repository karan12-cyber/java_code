import java.util.Scanner;
public class shoping_priceminmaxby_insection {
    public static void main(String[]args){
        int n,k;
        String k1;
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the range of custumer ");
        n=sc.nextInt();
        int[]price=new int[n];
        String[]name=new String[n];
        for (int i=0;i<n;i++){
            System.out.println("enter the bill of custumer: "+(i+1));
            price[i]=sc.nextInt();
            System.out.println("enter the name of custumer:"+(i+1));
            sc.nextLine();
            name[i]=sc.nextLine();
 
        }
           for (int i=0;i<n;i++){
            k=price[i];
            k1=name[i];
            int j=i-1;
            while(j>=0&&k<price[j]){
                price[j+1]=price[j];
                name[j+1]=name[j];
                j--;

            }
              price[j+1]=k;
              name[j+1]=k1;
        }
        System.out.println("the max price is :"+price[+1]);
        System.out.println("the name of person:"+name[+1]);
      
    }
       
}  
               
    

