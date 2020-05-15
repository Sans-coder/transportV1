import java.sql.Date;


public class Submarine {
    private String ownership;
    private String GPSPosition;
    private String price;
    private Date dateOfPurchase;
    private String id;

    public Submarine(){}
    public Submarine(String id){this.id = id;}

    public void drivingMethod(){
        System.out.println("驾驶Submarine!!");
    }
}