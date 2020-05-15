import java.util.Scanner;


public class Person{
    private int p_Age;
    private String p_Sex;
    private String id;
    private String p_Namel;

    public Person(){}
    public Person(String name){p_Namel = name;}

    public void driveTransport(Aircraft a){
        a.drivingMethod();
    }

    public void driveTransport(Airship a){
        a.drivingMethod();
    }

    public void driveTransport(HotAirBalloon a)
    {
        a.drivingMethod();
    }

    public void driveTransport(Bicycle a)
    {
        a.drivingMethod();
    }

    public void driveTransport(Automobile a)
    {
        a.drivingMethod();
    }

    public void driveTransport(Hovercraft a)
    {
        a.drivingMethod();
    }

    public void driveTransport(Motorcycle a)
    {
        a.drivingMethod();
    }

    public void driveTransport(Ship a)
    {
        a.drivingMethod();
    }

    public void driveTransport(Submarine a)
    {
        a.drivingMethod();
    }





    public static void main(String[] args) throws Exception {
        Person person = new Person("xiaoming");
        Aircraft aircraft = new Aircraft("1");
        Airship airship = new Airship("2");
        Automobile automobile = new Automobile("3");
        Bicycle bicycle = new Bicycle("4");
        HotAirBalloon hotAirBalloon = new HotAirBalloon("5");
        Hovercraft hovercraft = new Hovercraft("6");
        Motorcycle motorcycle = new Motorcycle("7");
        Ship ship = new Ship("8");
        Submarine submarine = new Submarine("9");
        person.driveTransport(aircraft);
        person.driveTransport(airship);
        person.driveTransport(automobile);
        person.driveTransport(bicycle);
        person.driveTransport(hotAirBalloon);
        person.driveTransport(hovercraft);
        person.driveTransport(motorcycle);
        person.driveTransport(ship);
        person.driveTransport(submarine);
    }
}
