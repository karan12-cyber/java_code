import java.util.Scanner;


public class distance_in_m_to_km_mm {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in meters: ");
        int m;
        m = sc.nextInt();
        float km= m/1000f;
        float mm = m*1000f;
        System.out.println("Distance in km: "+km);
        System.out.println("Distance in mm:"+mm);
        
        }
        }


        


