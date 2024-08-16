import java.util.Scanner;
public class sumoftwomatrix{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for matrix1");
        int r1=sc.nextInt();
        System.out.println("Enter the number of columns for matrix1");
        int c1=sc.nextInt();
        System.out.println("Enter the number of rows for matrix2");
        int r2=sc.nextInt();
        System.out.println("Enter the number of columns for matrix2");
        int c2=sc.nextInt();
        if(r1!=r2 || c1!=c2){
            System.out.println("Matrix addition is not possible");
            
            }
            int[][]matrix1=new int[r1][c1];
            int[][]matrix2=new int[r2][c2];
            int[][]result=new int[r1][c1];
            System.out.println("Enter the elements of matrix1");
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    matrix1[i][j]=sc.nextInt();
                    }
                    }
                    System.out.println("Enter the elements of matrix2");
                    for(int i=0;i<r2;i++){
                        for(int j=0;j<c2;j++){
                            matrix2[i][j]=sc.nextInt();
                            }
                            }
                            for(int i=0;i<r1;i++){
                                for(int j=0;j<c1;j++){
                                    result[i][j]=matrix1[i][j]+matrix2[i][j];
                                    }
                                    }
                                    System.out.println("The sum of two matrices is");
                                    for(int i=0;i<r1;i++){  
                                        for(int j=0;j<c1;j++){
                                            System.out.print(result[i][j]+" ");
                                            }
                                            System.out.println();
                                            }
                                            }
                                            }
                                            
                                        
                               
    

