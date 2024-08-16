import java.util.Scanner;

public class multiplyofmatrix {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows for matrix A");
        int r1=sc.nextInt();
        System.out.println("Enter the number of columns for matrix A");
        int c1=sc.nextInt();
        System.out.println("Enter the number of rows for matrix B");
        int r2=sc.nextInt();
        System.out.println("Enter the number of columns for matrix B");
        int c2=sc.nextInt();
        if(c1!=r2){
            System.out.println("Matrix multiplication is not possible");
            return;
        }
        int A[][]=new int[r1][c1];
        int B[][]=new int[r2][c2];
        int C[][]=new int[r1][c2];
       
        System.out.println("Enter the elements of matrix A");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of matrix B");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                B[i][j]=sc.nextInt();
            }
        }
        int n,m,r;
        n=r1;
        m=c2;
        r=c1;

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                int sum=0;
                for(int k=0;k<r;k++){
                    sum+=A[i][k]*B[k][j];
                }
                C[i][j] =sum;
            }
        }
                            
        System.out.println("The product of matrix A and B is");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }  
    }
}
    

