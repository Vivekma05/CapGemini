class Heart{
    private double weight;
    private int bpm;
    Heart(double weight,int bpm){
        this.weight=weight;
        this.bpm=bpm;
    }
    public double getWeight(){
        return weight;
    }
    public int getBpm(){
        return bpm;
    }
}
class Brain{
    private double weight;
    private String color;
    Brain(double weight,String color){
        this.weight=weight;
        this.color=color;
    }
    public double getWeight(){
        return weight;
    }
    public String getColor(){
        return color;
    }
}
class Bike{
    private String Company;
    private double Milage;
    Bike(String Company,double Milage){
        this.Company=Company;
        this.Milage=Milage;
    }
    String getCompany(){
        return Company;
    }
    double getMilage(){
        return Milage;
    } 
}
class Book{
    private String Name,Author;
    Book(String Name,String Author){
        this.Name=Name;
        this.Author=Author;
    }
    public String getName(){
        return Name;
    }
    public String getAuthor(){
        return Author;
    }
}
class Student{
    Heart h=new Heart(3,107);
    Brain b=new Brain(2,"grey");
    void hasBike(Bike bi){
        bi.getCompany();
        bi.getMilage();
    }
    void hasBook(Book bo){
        bo.getName();
        bo.getAuthor();
    }
}
class aggregation_and_composition_02{
    public static void main(String[]args){
        Bike b=new Bike("ola",100);
        Book bo=new Book("dsa","thrishantha");
        Student s=new Student();
        System.out.println(s.h.getWeight());
        System.out.println(s.h.getBpm());
        System.out.println(s.b.getWeight());
        System.out.println(s.b.getColor());
        s.hasBike(b);
        s.hasBook(bo);
    }
}