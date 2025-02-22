package apnaCollege.D_Bank;

class Account{
    public String name;
    protected String email;
    private String paasword;

    //getters & setters
    public String getPaasword(){
        return this.paasword;
    }

    public void setPaasword(String pass){
        this.paasword= pass;
    }
}

public class bank{
    public static void main(String[] args) {

        Account a1 = new Account();
        a1.name = "sakshi";
        a1.email="sakshi@gmail.com";

        a1.setPaasword("abcsd");
        System.out.println(a1.getPaasword());
    }
}