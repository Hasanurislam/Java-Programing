import java.util.Scanner;


public class LabP {
   
    public static void main(String[] args) {
        int term;
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter the term: ");
        term=ob.nextInt();
        for(int i=1;i<=10;i++)
        {
            int m=term*i;
            System.out.println(term+"X"+i+"="+m);
        }
     
      
    }
}
