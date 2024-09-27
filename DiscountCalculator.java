import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        double amount;
        String status;
        double discount=0.0;
        System.out.print("Enter the purchase amount: ");
        Scanner r=new Scanner(System.in);
        amount=r.nextDouble();
        System.out.print("Enter customer loyalty status (loyal/not loyal): ");
        status = r.next().toLowerCase();

        if(amount>5000)
        {
            System.out.print("No Discount");
        }
        else if(amount>=5000 || amount>=10000)
        {
            if(status.equals("loyal"))
            {
               discount=10.0;
            }
            else{
                discount=5.0;
            }
        }
        else if(amount>10000 )
        {
            if(status.equals("loyal"))
            {
                discount=20.0;
            }
            else{
                discount=15.0;
            }
        }
        double totalprice=amount-(amount*discount/100);
        System.out.print("Total price: "+totalprice);
    }
}
