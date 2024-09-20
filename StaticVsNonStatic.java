public class StaticVsNonStatic {
    int a=10;
    static int b=20;
    public static void main(String[] args) {
        StaticVsNonStatic r=new StaticVsNonStatic();
        Show();
        r.disp();
    }
    static void Show(){

        System.out.print(+b);
    }
    void disp(){
        System.out.print(+a +" "+b);
    }
}
