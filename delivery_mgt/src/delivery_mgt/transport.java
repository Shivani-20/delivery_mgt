package delivery_mgt;

public class transport 
{
public static void main(String args[])
{
        Items obj1=new delivery_type("Package");
        cargo_ships ship=new cargo_ships();
        ship.load(obj1);
        
        System.out.print("\n");
        
        Items obj2=new delivery_type("Package");
        cargo_airplanes plane=new cargo_airplanes();
        plane.load(obj2);
        
        System.out.print("\n");

        Items obj3=new delivery_type("Letter");
        mail_truck truck=new mail_truck();
        truck.load(obj3);

}
}