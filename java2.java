 class java2 {
    static int a=10; //static variable
    void fun(){

    
        int b=10; //local variable
        System.out.println(a+" "+b);
        ++a; ++b;
    }
    public static void main(String[] args) {
        java2 r=new java2();
        r.fun();   
        r.fun();
    }
    
}
