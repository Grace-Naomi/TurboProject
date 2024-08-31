package com.sdtt.encapsulation;

public class EncapsulationChild extends EncapsulationParent {


        public static void main(String[] args) {
            EncapsulationChild encapsulationChild=new EncapsulationChild();

            encapsulationChild.setId(100);
            encapsulationChild.setName("Grace");
            encapsulationChild.getData();

            System.out.println(encapsulationChild.getId());
            System.out.println(encapsulationChild.getName());


        }

}
