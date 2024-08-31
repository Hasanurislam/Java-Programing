import java.util.Scanner;
public class Q45 {
    public static void main(String[] args) {
        int max;
        System.out.print("Enter the array elements: ");
        Scanner r=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<a.length;i++)
        {
           a[i]=r.nextInt();
        }
        max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            }
            System.out.print("The biggest element in the array: "+max);


        }
    }
    

