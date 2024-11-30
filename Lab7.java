import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {
        int term;
        System.out.print("Enter the term: ");
        Scanner ob=new Scanner(System.in);
        term=ob.nextInt();
        int i=1,m;
        while(i<=10){
            m=term*i;
            System.out.println(term+"X"+i+"="+m);
            i++;
        }
    }
    
}
