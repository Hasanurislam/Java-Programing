class A{
   int a=10;
   static int b=20;
   
   void show()
   {
    System.out.println(a+" "+b);
   }
   static void Disk()
   {
    System.out.println(" "+b);
   }

}
    public class Exam1 {
    public static void main(String[] args) {
        A r=new A();
        A.Disk();
        r.show();
    }
}

