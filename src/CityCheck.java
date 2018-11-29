import java.util.Scanner;

public class CityCheck {
    private ReadFile rf1;
    private Graph graph1;
    private Graph Europe;
    private Vertex temp;

    public int CityCheck(ReadFile rf1, Graph graph1, Graph Europe, Vertex temp, String data1, String data2) throws Exception {
        this.rf1 = rf1;
        this.graph1 = graph1;
        Europe = rf1.loadData("/Users/apple/Desktop/services.txt", graph1);
        System.out.println("Please input start city:");
        String start = data1;
        System.out.println("please input destnation:");
        String destination = data2;

        int v1 = -1;
        int v2 = -1;
        for (int i = 0; i <= 22; i++) {
            if (start.equals(temp.getData()))
                v1 = i;
            if (destination.equals(temp.getData()))
                v2 = i;

        }

        System.out.print("The cheapest route from " + start + " to " + destination + " is ");
        if(start.equals("London"))
            Europe.shortestPath(v1,v2);

         return 0;
    }
}
