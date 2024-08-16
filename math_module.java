import java.util.Scanner;


public class math_module {
    public static void main(String[] args) {
        int a,b;
        float c;
     Scanner sc= new Scanner(System.in);
     System.out.println("enter the value of a");
     System.out.println("enter the value of b");
     System.out.println("enter the value of c");
     a=sc.nextInt();
     b=sc.nextInt();
     c=sc.nextFloat();
       double v=Math.min(a,b) ;
       double d=Math.max(a,b);
       double e=Math.abs(a-b);
       double f=Math.pow(a,b);
       double g=Math.sqrt(a);
      double h=Math.sqrt(b);
      double i=Math.cbrt(a);
      double j=Math.cbrt(b);
      double k=Math.exp(a);
      double l=Math.exp(b);
      double m=Math.floor(c);
      double n=Math.ceil(c);
      System.out.println(v);
      System.out.println(d);
      System.out.println(e);
      System.out.println(f);
      System.out.println(g);
      System.out.println(h);
      System.out.println(i);
      System.out.println(j);
      System.out.println(k);
      System.out.println(l);
      System.out.println(m);
      System.out.println(n);

    
    }
}
    

