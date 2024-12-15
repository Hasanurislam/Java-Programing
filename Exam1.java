class A extends Thread{
   public void run(){
       try{
         for(int i=1;i<=5;i++){
         System.out.println("Hasanur");
         Thread.sleep(1000);
      }
   }
   catch(InterruptedException i){

   }
}
}
public class Exam1 {

   public static void main(String[] args) throws InterruptedException {
      A t=new A();
      t.start();

      for(int i=1;i<=5;i++){
         System.out.println("Zulfikar");
         Thread.sleep(1000);
      }
   }
}