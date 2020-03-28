import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class App {
    public static String[] vehicles = {
            "ambulance", "helicopter", "lifeboat"
    };
    public static String [][] drivers = {
            {"Fred", "Sue", "Pete"},
            {"Sue", "Richard", "Bob", "Fred"},
            {"Pete", "Mary", "Bob"}
    };

    public static void main(String[] args) {
        Map<String, Set<String>> personnel = new HashMap<String, Set<String>>();
        for (int i = 0; i < vehicles.length ; i++) {
            String vehicle = vehicles[i];
            String [] driverList = drivers[i];

            //to check
            System.out.println("Vehicle type: " + vehicle);

            Set<String> driverSet = new LinkedHashSet<String>();

            for(String driver: driverList){
                driverSet.add(driver);

                //to check
                System.out.println("Driver names: " + driver);
            }

            personnel.put(vehicle, driverSet);
        }

            Set <String> driversList = personnel.get("helicopter");
            for(String driver: driversList){
            System.out.println(driver);
        }
    }
}
