package Inheritance;

public class InheritanceChild extends InheritanceParent {


    /**
     * Inheritance - mainly for re-usability
     */


        public static void main(String[] args) {
            InheritanceChild inheritanceChild=new InheritanceChild();


            // Parent parent = new Parent();
            inheritanceChild.login("Selenium", "Test2123");

            payment();
            booking();
        }

        public static void booking(){
            System.out.println("Booking completed");
        }
}
