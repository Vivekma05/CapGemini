/*
1.An interface is like a contract which when implemented helps to achieve standardization whatever mentioned in the contract must be used 
as it is without any changes and interface can contain any number of methods 
2.interface promotes polymorphism and an interface type ref can point to implementing class objects this acchieves lose coupling and 
hence code reduction and code complecity methods with an interface are automatically public and abstract 
rules:
1.an interface is like a contract to help achieve standardization 
2.Interface promotes polymorphism and interface type ref can point to implementing class objects this achieves lose coupling code reduction
and code flexibility.
3.methods within a interface are automatically public abstract.
4.specialized methods cannot be accesed directly using interface type reference. 
5.if a class pertailly implemenst the interface it must declare itself as abstract.
6.a class can implement multiple interfaces becuase diomand shape problem does not exist as interface will not have a parent .
7.an interface cannot implement another interface because interface cannot provide methods with bodys inside it.
8.an interface can extend another interface not only this it can inherit from multiple interfaces because diamand shape problem never exist
multiple inheritance in java can be indireclty achieve by making use of interface.
9.a class can both extend another class as well as implement an interface however order shoould be extend first implement later.
10.an interface can contain constant variables and method signature a variable with in an interface is automatically public static final
11.an empty interface in java is referred as marker interface or tagged interface it is used to provide special properties to the object
of the class.
12.an object of an interface cannot be craeted because an interface is a collection of abstract methods however refereance can be created
so that loose coupling polymorphism and its advantages can be achieved.
*/

import java.util.*;

interface Cal1{
    void add();
    void sub();
}
interface Cal2{
    void mul();
    void div();
}
interface cal3 extends Cal1,Cal2{      //extends 2 abstract class
    public void add();
}
class MyCalculator implements Cal1,Cal2{     //implements 2 abstract classes
    public void add(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int num1=sc.nextInt();
        System.out.println("enter the second number");
        int num2=sc.nextInt();
        int res=num1+num2;
        System.out.println(res);
    }
    public void sub(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int num1=sc.nextInt();
        System.out.println("enter the second number");
        int num2=sc.nextInt();
        int res=num1-num2;
        System.out.println(res);
    }
    public void div(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int num1=sc.nextInt();
        System.out.println("enter the second number");
        int num2=sc.nextInt();
        int res=num1/num2;
        System.out.println(res);
    }
    public void mul(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int num1=sc.nextInt();
        System.out.println("enter the second number");
        int num2=sc.nextInt();
        int res=num1*num2;
        System.out.println(res);
    }
}
interface Calculator{
    void add();
    void sub();
}
class Calculator1 implements Calculator{
    //if we need to partially implements the methods then we need to make the class as abstract 
    public void add(){
        int num1=10;
        int num2=20;
        int res=num1+num2;
        System.out.println(res);
    }
    public void sub(){
        int num1=30;
        int num2=40;
        int res=num1-num2;
        System.out.println(res);
    }
    public void multiplication(){
        int num1=30;
        int num2=40;
        int res=num1*num2;
        System.out.println(res);
    }
}
class Calculator2 implements Calculator{
    public void add(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int num1=sc.nextInt();
        System.out.println("enter the second number");
        int num2=sc.nextInt();
        int res=num1+num2;
        System.out.println(res);
    }
    public void sub(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int num1=sc.nextInt();
        System.out.println("enter the second number");
        int num2=sc.nextInt();
        int res=num1-num2;
        System.out.println(res);
    }
}
class poly{
    void polymorphism1(Calculator ref){
        ref.add();
        ref.sub();
    }
}
class interface_01{
    public static void main(String[]args){
        Calculator c;
        Calculator1 c1=new Calculator1();
        Calculator2 c2=new Calculator2();
        //poly p=new poly();
        //p.polymorphism1(c1);
        ///p.polymorphism1(c2);
        c=c1;
        c.add();
        c.sub();
        //c.multiplication(); produce error 
        ((Calculator1)(c)).multiplication();
        MyCalculator m1=new MyCalculator();
        m1.add();
        m1.sub();
        m1.mul();
        m1.div();
    }
}