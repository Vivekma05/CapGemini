class Os{
    private String name;
    private int bits;
    Os(String name,int bits){
        this.name=name;
        this.bits=bits;
    }
    public String getName(){
        return name;
    }
    public int getBits(){
        return bits;
    }
}
class Charger{
    private String chargertype;
    private double watts;
    Charger(String chargertype,double watts){
        this.chargertype=chargertype;
        this.watts=watts;
    }
    public String getChargerType(){
        return chargertype;
    }
    public double getWatts(){
        return watts;
    }
}
class Mobile{
    Os os=new Os("windows",64);
    void hasACharger(Charger c){
        System.out.println(c.getChargerType());
        System.out.println(c.getWatts());
    }
}
class aggregation_and_composition{
    public static void main(String[]args){
        Charger c=new Charger("c-pin",22);
        Mobile m=new Mobile();
        System.out.println(m.os.getName());
        System.out.println(m.os.getBits());
        m.hasACharger(c);
        m=null;
        System.out.println(m.os.getName());
        System.out.println(m.os.getBits());
        m.hasACharger(c);
    }
}