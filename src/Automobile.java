import java.sql.Date;

public class Automobile {
    private String ownership;
    private String GPSPosition;
    private String price;
    private Date dateOfPurchase;
    private String id;

    public Automobile(){}
    public Automobile(String id){this.id = id;}

    public void drivingMethod(){
        System.out.println("驾驶Automobile!!");
    }
}