import java.util.Scanner;
public class reverseofstring {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("write the string");
        String a=sc.nextLine();
        a =a+' ';
        String s="";
        for(int i=0;i<a.length();i++){
            char c =a.charAt(i);
            if(c==' '){
                String s1= "";
                for(int j=0;j<s.length();j++){
                    s1 = s.charAt(j) + s1;
                }
                if(s.equals(s1)){
                    System.out.println(s);
                }    
                s="";   
            }else{
                s = s +c;
            }

        }    
    
    }
      
}       
