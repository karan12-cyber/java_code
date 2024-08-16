import java.util.Scanner;


public class tem_celcius_to_ferhanite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float celcius;
        float ferhanite;
        System.out.println("Enter the temperature in celcius");
        celcius = sc.nextFloat();
        ferhanite = (celcius * 9/5) + 32;
        System.out.println("The temperature in ferhanite is " + ferhanite);
    }
    
}
