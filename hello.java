class hello
{
    static int x=20; //static
    int c=40; //Instance
    public static void main(String args[])
    {
        hello ref=new hello(); 
        int a= 10; //local 
        System.out.println(a);
        System.out.println(hello.x);
        System.out.println(ref.c);
        

    }
}