import java.util.Scanner;
public class shoping_price_minmax {
    public static void main(String[]args){
        int n,min,max;
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the range of custumer ");
        n=sc.nextInt();
        int[]arr=new int[n];
        String[]array=new String[n];
        for (int i=0;i<n;i++){
            System.out.println("enter the bill of custumer: "+(i+1));
            arr[i]=sc.nextInt();
            System.out.println("enter the name of custumer:"+(i+1));
            sc.nextLine();
            array[i]=sc.nextLine();

        }
        min=arr[0];
        max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
                
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("minimum bill "+min);
        System.out.println("maximum bill "+max);
        for(int i=0;i<n;i++){
            if(arr[i]==min){
                System.out.println("minimum bill custumer name : "+array[i]);
            }
            if(arr[i]==max){
                System.out.println("maximum bill custumer name: "+array[i]);


            }
       
        }
   
    }

           
                        
}
            
        




