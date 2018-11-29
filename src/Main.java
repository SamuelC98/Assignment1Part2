
public class Main {
    private static CityCheck cityCheck = new CityCheck();
    private static ReadFile rf1 = new ReadFile();
    private static Graph graph1 = new Graph();
    private static Graph Europe = new Graph();
    private static Vertex temp = new Vertex();
    private static String data1 = "London";
    private static String data2 = "Skopja";


    public static void main(String[] args) throws Exception {
        cityCheck.CityCheck(rf1,graph1,Europe,temp,data1,data2);
    }

}
