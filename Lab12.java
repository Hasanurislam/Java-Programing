import java.util.Scanner;

public class Lab12 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size=ob.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=ob.nextInt();
        }
        int max;
        max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i])
            {
                max=arr[i];
                
            }
        }
        System.out.print("Largest of the array: "+max);

    }
    
}
