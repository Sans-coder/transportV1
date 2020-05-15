import java.sql.Date;

public class Hovercraft {
    private String ownership;
    private String GPSPosition;
    private String price;
    private Date dateOfPurchase;
    private String id;

    public Hovercraft(){}
    public Hovercraft(String id){this.id = id;}

    public void drivingMethod(){
        System.out.println("驾驶Hovercraft!!!");
    }

}