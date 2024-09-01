public class Q51 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)//rows
        {
           for(int j=i;j<5;j++)//space
           {  
            System.out.print(" ");
           }
              for(int k=1;k<=i;k++)
              {
                System.out.print("*");
              }
              System.out.print("\n");
           
        }
    }
    
}
