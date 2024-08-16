import java.util.Scanner;
public class bubble_short {
    public static void main(String[]args){
        int n;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your range of array");
        n=sc.nextInt();
        int[]ar=new int[n];
        System.out.println("Enter your values");
        for(int i=0;i<n;i++){
        ar[i]=sc.nextInt();
        }
            for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
            if(ar[j]>ar[j+1]){
            int temp=ar[j];
            ar[j]=ar[j+1];
            ar[j+1]=temp;
                    }
                }
            }
              System.out.println("Sorted array is");
             for(int i=0;i<n;i++){
             System.out.println(ar[i]);
        }
    }
}

  
            
        












        
            
        

