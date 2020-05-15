import java.sql.Date;

public class Airship {
    private String ownership;
    private String GPSPosition;
    private String price;
    private Date dateOfPurchase;
    private String id;

    public Airship(){}
    public Airship(String id){this.id = id;}

    public void drivingMethod(){
        System.out.println("驾驶Airship!!");
    }
}