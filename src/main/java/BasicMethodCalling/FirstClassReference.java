package BasicMethodCalling;

public class FirstClassReference {
    int i=5;
    String s="Selenium";
    char c='T';
    boolean b= true;
    float f= 10f;
    double d= 11.5;

    public static void sum(){
        int a=10,b=5,c;
        c= a+b;
        System.out.println("c value::"+c);

    }
    public static String getText(){
        String str="Test Automation";
        return str;
    }

    public static void total(int e, int g){

        int t=e*g;
        System.out.println(t);

    }
}
