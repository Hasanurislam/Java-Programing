import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        int a,b,c,sp;
        double area;
        
        System.out.print("Enter the sides of tringle: ");
        Scanner ref=new Scanner(System.in);
        a=ref.nextInt();
        b=ref.nextInt();
        c=ref.nextInt();
        
        sp=(a+b+c)/2;
        area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
        System.out.print("the area of tringle: "+area);
        
    }
    
}
