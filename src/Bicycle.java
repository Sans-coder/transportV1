import java.sql.Date;

public class Bicycle {
    private String ownership;
    private String GPSPosition;
    private String price;
    private Date dateOfPurchase;
    private String id;

    public Bicycle(){}
    public Bicycle(String id){this.id = id;}

    public void drivingMethod(){
        System.out.println("驾驶Bicycle!!");
    }
}