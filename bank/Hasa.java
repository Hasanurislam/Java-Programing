
package bank;

class Account{
    public String name;
    protected String email;
    private String password;
    //getters & settors
    public String getpassword(){

        return this.password;
    }
    public void setpassword(String pass){
        this.password=pass;
    }
}
public class Hasa {
    public static void main(String[] args) {
        Account account1=new Account();
        account1.name="Zulfikar";
        account1.email="hasa.com";
        account1.setpassword("hasa123");
        System.out.println(account1.getpassword());
    }
    
}
