import java.sql.Date;


public class HotAirBalloon {
    private String ownership;
    private String GPSPosition;
    private String price;
    private Date dateOfPurchase;
    private String id;

    public HotAirBalloon(){}
    public HotAirBalloon(String id){this.id = id;}

    public void drivingMethod(){
        System.out.println("驾驶HotAirBalloon!!");
    }
}