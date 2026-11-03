abstract class Plane{
    abstract void takeoff();
    abstract void fly();
    abstract void land();
}
class CargoPlane extends Plane{
    public void takeoff(){
        System.out.println("cargo ptakeoff");
    }
    void fly(){
        System.out.println("cargo p flying at low heights");
    }
    void land(){
        System.out.println("cargo plane is landing");
    }
}
class PassengerPlane extends Plane{
    public void takeoff(){
        System.out.println("passenger plane is takeoff");
    }
    void fly(){
        System.out.println("pp flying at low heights");
    }
    void land(){
        System.out.println("pp is landing");
    }
}
class Airport{
    void permit(Plane r){
        r.takeoff();
        r.fly();
        r.land();
    }
}
class abstract_01{
    public static void main(String[]args){
    CargoPlane a=new CargoPlane();
    PassengerPlane b=new PassengerPlane();
    Airport c=new Airport();
    c.permit(a);
    c.permit(b);
    }
}