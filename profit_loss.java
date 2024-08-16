import java.util.Scanner;

public class profit_loss {
    public static void main(String[] args) {
        int cost_price,selling_price;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the cost price of the product");
        System.out.println("Enter the selling price of the product ");
        cost_price=sc.nextInt();
        selling_price=sc.nextInt();
        if (selling_price>cost_price){
            int profit=selling_price-cost_price;

            System.out.println("you profit of:"+profit);



        }else if (cost_price>selling_price){
            int loss=cost_price-selling_price;
        System.out.println("you have loss of: "+loss);

        }else{

            System.out.println("neither profit nor loss");
        }


        
    }
}
    

