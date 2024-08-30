import java.util.Scanner;

public class Q39 {
    public static void main(String[] args) {
        System.out.print("Enter Array Elements: ");
        Scanner r=new Scanner(System.in);
        int a[]=new int[6];
        int temp;
        for(int i=0;i<6;i++)
        {
          a[i]=r.nextInt();
        }
        System.out.println("The Array Elements: ");
        for(int i=0;i<6;i++)
        {
            System.out.print(a[i]+" ");
        }

        for(int i=0;i<6;i++)
        {
            for(int j=i+1;j<6;j++)
            {
                if(a[i]>a[j])
                {    
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                    
                }   
            }
        }

            System.out.println("After sorting the array elements:");
            for(int i=0;i<a.length;i++)
            {
               System.out.print(a[i]+" ");
            }
        }
    }
    
