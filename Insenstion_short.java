import java.util.Scanner;
public class Insenstion_short {
    public static void main(String[] args) {
      Scanner sc=new Scanner (System.in);
      System.out.println("Enter the range of array");
      int n=sc.nextInt();
      System.out.println("Enter the values ");
      int ar[]=new int[n];
      for(int i=0;i<n;i++)
      {
        ar[i]=sc.nextInt();

        }        
           for(int i=1;i<n-1;i++){
           int k=ar[i],j=i-1;
            while(k<ar[j]&&j>=0){
                ar[j+1]=ar[j];
                j--;
       }

    }  
     
  }  
           

}               
                  
                        







     
 










    

