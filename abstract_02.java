/*'''create a abstract class called shape inside it create one variable called area 
and abstract methods accept input and calculate area and then create one normal method
 to display areacreate square class ,rectangle and circle class as sub classes and we 
 need to calaculatee the area of all 3'''*/
 import java.util.*;
 abstract class Shape{
    double area;
    abstract void accept_input();
    abstract void calculate_area();
    void display(){
        System.out.println("area="+area);
    }
 }
 class Square extends Shape{
    double side;
    Scanner sc = new Scanner(System.in);
    void accept_input() {
        System.out.println("Enter side of square:");
        side = sc.nextDouble();
    }
    void calculate_area() {
        area = side * side;
    }
 }
 class Rectangle extends Shape{
    double length, breadth;
    Scanner sc = new Scanner(System.in);
    void accept_input() {
        System.out.println("Enter length:");
        length = sc.nextDouble();
        System.out.println("Enter breadth:");
        breadth = sc.nextDouble();
    }
    void calculate_area() {
        area = length * breadth;
    }
 }
 class Circle extends Shape{
    double radius;
    Scanner sc = new Scanner(System.in);
    void accept_input() {
        System.out.println("Enter radius:");
        radius = sc.nextDouble();
    }
    void calculate_area() {
        area = 3.14 * radius * radius;
    }
 }
 class REF{
    public void ref(Shape ref){
        ref.accept_input();
        ref.calculate_area();
        ref.display();
    }
 }
 class abstract_02{
    public static void main(String[]args){
        Square s = new Square();
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        REF reference=new REF();
        reference.ref(s);
        reference.ref(r);
        reference.ref(c);
    }
 }