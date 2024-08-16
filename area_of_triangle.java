import java.util.Scanner;


public class area_of_triangle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        // Scanner sc = new Scanner(System.in);
        float height;
        float base;
        System.out.println("enter the height:");
        System.out.println("enter the base:");
        base=sc.nextFloat();
        height=sc.nextFloat();
        float area =0.5f*base*height;
        System.out.println("area of triangle is:"+ area);

    }
    
}
