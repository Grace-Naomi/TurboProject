package Polymorphism;

public class PolymorphismChild extends PolymorphismParent{

    public static void main(String[] args) {
        PolymorphismParent polymorphismParent = new PolymorphismParent();
        PolymorphismChild polymorphismChild = new PolymorphismChild();
        polymorphismChild.sum(5, 5, 5);
        polymorphismParent.testAutomation();
        polymorphismChild.testAutomation();


        String str = polymorphismChild.getText("Tool");
        System.out.println(str);

        String s = "Test :: " + "Software";
        System.out.println(s + " :: " +polymorphismChild.getText());


    }
    public void testAutomation(){
        int a=5;
        String s="Selenium Automation";
        if (a==5){
            System.out.println("Level 1 completed");
        }
        if (s=="Selenium Automation"){
            System.out.println("Both are same");
        }
    }


    public void sum(int a,double b){
        System.out.println("a+b");
    }

    public void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public String getText(){
        return "Automation Testing";
    }

    public String getText(String text){
        String s = "Selenium " + text;
        return s;
    }

    public void getText(int a){
        System.out.println("Test");
    }

}
