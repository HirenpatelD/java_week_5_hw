import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Programme_10_Zone1TubeLine {

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> tubeLine = new HashMap<>();
        tubeLine.put("BakerStreet", new ArrayList<>());
        tubeLine.get("BakerStreet").add("Circle Line");
        tubeLine.get("BakerStreet").add("Bakerloo Line");
        tubeLine.get("BakerStreet").add("Jubilee Line");
        tubeLine.get("BakerStreet").add("Metropolitan Line");
        tubeLine.get("BakerStreet").add("Hammersmith and CityLine");

        //System.out.Println(tube.Line.get("BakerStreet"));

        tubeLine.put("Euston", new ArrayList<>());
        tubeLine.get("Euston").add("Northern Line");
        tubeLine.get("Euston").add("Victoria Line");

        //System.out.println(tube.line.get("Euston"));

        tubeLine.put("GreenPark", new ArrayList<>());
        tubeLine.get("GreenPark").add("Jubilee line");
        tubeLine.get("GreenPark").add("Piccadilly line");
        tubeLine.get("GreenPark").add("Victoria line");

        //System.out.println(tube.Line.get("GreenPark"));

        HashMap<String, String> tubeZone = new HashMap<>();
        tubeZone.put("BakerSteet", "Zone 1");
        tubeZone.put("Euston", "Zone 1");
        tubeZone.put("GreenPark", "Zone 1");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the station name : ");
        String nameOfStation = scanner.next();
        System.out.println("TubeLines passing through " + nameOfStation + " is: " + tubeLine.get(nameOfStation));
        //System.out.println(nameOfStation + " is in the " + tubeZone.get(nameOfStation));
        scanner.close();
    }
}













