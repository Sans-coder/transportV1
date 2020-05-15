import java.sql.Date;

public class Aircraft {
    private String ownership;
    private String GPSPosition;
    private String price;
    private Date dateOfPurchase;
    private String id;

    public Aircraft(){}
    public Aircraft(String id){this.id = id;}

    public void drivingMethod(){
        System.out.println("驾驶Aircraft!!");
    }
}