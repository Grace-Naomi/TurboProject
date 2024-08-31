package Abstraction;

public class AbstractImplementation extends ParentClass{
    public void test2() {
        System.out.println("Test2 execution");
    }

    @Override
    public void test2(String s) {
        System.out.println("Test2 execution :: " + s);
    }
}
