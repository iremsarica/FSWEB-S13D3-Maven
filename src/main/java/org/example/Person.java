package org.example;

public class Person {
    String firstname;
    String lastname;
    int age;

    String whereFrom;
    Double height;
    Double weight;

    public  Person (String firstname,String lastname,int age){
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;

    }
    public  Person(String whereFrom,double height,double weight){
        this.whereFrom=whereFrom;
        this.height=height;
        this.weight=weight;
    }
    public  String getFirstName(){
        return this.firstname;
    }
    public  String getLastName(){
        return this.lastname;
    }
    public int getAge(){
        return  this.age;
    }
    public boolean isTeen(){
        return this.age >= 13 && this.age < 19 ;
    }
}
