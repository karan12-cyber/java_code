import java.util.Scanner;
public class quick_sort {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the range of array:");
     int n=sc.nextInt();
     int[]num= new int[n];
     System.out.println("Enter the values:");
     for (int i=0;i<n;i++){
        num[i]=sc.nextInt();
     } 
     quicksort(num, 0, n-1);
     for (int elem : num) {
         System.out.println(elem);
     }
    
    }
    
    static void quicksort(int []ar,int l,int h){
      int pi=part(ar,l,h);
      quicksort(ar,l,pi-1);
      quicksort(ar,pi+1,h);
    }
  
  static int part(int ar[],int l,int h){
    int p=ar[l];
    int i=h;
    for (int j=l+1;j<=h;j++){
      if(ar[j]>p){
        int t=ar[i];
        ar[i]=ar[j];
        ar[j]=t;
        j--;
        
      }
    }
    ar[l]=ar[i];
    ar[i]=p;
    return (i);
    
  }       
  
}
    

    

