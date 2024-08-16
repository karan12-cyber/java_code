import java.util.Scanner;
public class reversearrayofstring {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the range of string:");
        int num=sc.nextInt();
        String[]a=new String[num];
        System.out.println("enter the element of  string");
        for (int i=0;i<num;i++){
            sc.next();
            a[i]=sc.nextLine();

        }
        for(int i=0;i<a.length;i++){
            String s="";
            for(int j=0;j<a[i].length();j++){
                s = a[i].charAt(j) + s;
            }
            if(s.equals(a[i])){
                System.out.println(s);
            }
        }
       


    }
    
}
    
        
        





