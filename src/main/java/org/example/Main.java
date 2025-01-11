package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Person person1 = new Person("İrem","Sarıca",27);

        System.out.println("Firstname:"+ person1.getFirstName());
        System.out.println("Lastname:"+ person1.getLastName());
        System.out.println("Age:"+ person1.getAge());

        System.out.println("************************************");

        Wall wall1 = new Wall(5,4);
        System.out.println("area="+ wall1.getArea());
        wall1.setHeight(-1.5);
        System.out.println("weight="+wall1.getWidth());
        System.out.println("height="+wall1.getHeight());
        System.out.println("area="+ wall1.getArea());

    }



}
