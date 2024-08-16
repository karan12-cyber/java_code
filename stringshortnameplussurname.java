import java.util.Scanner;
public class stringshortnameplussurname {
    public static void main(String[]args){
        String S,s="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your full name");
        S=sc.nextLine();
        String[] words=S.split(" ");
        for (int i = 0; i < words.length-1; i++) {
            
            s+=Character.toString( Character.toUpperCase( words[i].charAt(0)))+" ";
        }
        String surname=words[words.length-1];
        System.out.println("Your short name is "+s+surname);

    } 
    
}
