package BasicMethodCalling;

import java.sql.SQLOutput;

public class FirstSession {
    public static void main (String [] args){
        System.out.println("Automation Testing");
        FirstSession firstSession=new FirstSession();
        payment();
        firstSession.loginTest();
        FirstClassReference.sum();
        String s=FirstClassReference.getText();
        System.out.println(s);
        FirstClassReference firstClassReference=new FirstClassReference();
        FirstClassReference.total(17,15);
    }
    public static void payment(){

        System.out.println("payment successful");
    }

    public void loginTest(){

        System.out.println("Login Successful");
    }
}