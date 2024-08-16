import java.util.Scanner;
public class mergeshort {
    public  static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the range of array ");
        int n=sc.nextInt();
        int[]array=new int[n];
        System.out.println("Enter your values ");
        for (int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }

    }
    void mergesort(int[]ar,int l,int r){
         if(l<r){
            int m=(l+r)/2;
            mergesort(ar,l,m);
            mergesort(ar,m+1,r);
            sort(ar,l,m,r);
        }        
    }
        void sort(int[]ar,int l,int m,int r){
            int n1=m-l+1;
            int n2=r-m;
            int[]L=new int[n1];
            int []R=new int[n2];
            for(int i=0;i<n1;i++){
                L[i]=ar[l+i];
        }
            for(int i=0;i<n2;i++){
               R[i]=ar[m+i+1];
        }
          int K=l;
          int x=0;
          int y=0;
          while(x<n1 && y<n2){
            if(L[x]<R[y]){
                ar[K]=L[x];
                x++;

            }else{
                ar[K]=R[y];
                y++;

            }
            K++;
        }  
            while(x<n1){
            ar[K]=L[x];
            x++;
            K++;
           }
              while(y<n2){
                ar[K]=R[y];
                  y++;
                  K++;

        }

    }
    
}
