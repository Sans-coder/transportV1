import java.sql.Date;


public class Motorcycle {
    private String ownership;
    private String GPSPosition;
    private String price;
    private Date dateOfPurchase;
    private String id;

    public Motorcycle(){}
    public Motorcycle(String id){this.id = id;}

    public void drivingMethod(){
        System.out.println("驾驶MOtorcycle!!");
    }
}