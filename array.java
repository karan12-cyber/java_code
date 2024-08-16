import java.util.Scanner;
public class array{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.println("Enter the number of elements in the array");
        num = sc.nextInt();
        int arr[] = new int[num];
        int min =0;
        int max =0;
        int sum =0;

        
    
        System.out.println("Enter the elements of the array");
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
            if(i==0){
                min =arr[0];
                max =arr[0];
                 
            
            }else{
                if(arr[i]>max){
                max = arr[i];
                }
                if(arr[i]<min){
                    min = arr[i];
                }
            }
        }                                         
        System.out.println("Maximum element in the array is "+max);
        System.out.println("Minimum element in the array is "+min);
        System.out.println("Sum of elements in the array is "+sum);
        System.out.println("Avg of elements in the array is "+(sum/num));                
    }
}