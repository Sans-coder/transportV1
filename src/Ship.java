import java.sql.Date;

public class Ship {
    private String ownership;
    private String GPSPosition;
    private String price;
    private Date dateOfPurchase;
    private String id;

    public Ship(){}
    public Ship(String id){this.id = id;}

    public void drivingMethod(){
        System.out.println("驾驶Ship!!");
    }
}