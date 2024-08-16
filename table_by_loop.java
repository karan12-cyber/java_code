import java.util.Scanner;

public class table_by_loop {
    public static void main(String[]args){
        int table;
        System.out.println("Enter the table number: ");
        Scanner sc=new Scanner(System.in);
        table=sc.nextInt();
        for(int i=1;i<=10;i++){
            int m=table*i;
            System.out.println(m);
        
            // System.out.println(table+" * "+i+" = "+table*i);

        }
    }
    
}
