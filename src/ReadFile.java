import java.io.*;

public class ReadFile {
    private Graph graph1;
    public Graph<String> loadData(String filename,Graph graph) throws Exception {
        File file = new File(filename);
        this.graph1 = graph;
        InputStreamReader read = new InputStreamReader(new FileInputStream(file));
        BufferedReader bufferedReader1 = new BufferedReader(read);
        String line1 ;
        while((line1 = bufferedReader1.readLine())!=null) {

            String[] s = line1.split(" ");
            graph1.InsertVertex(s[0]);

        }
        BufferedReader br=new BufferedReader(new FileReader(filename));
        String line2;
        while((line2 = br.readLine())!=null) {

            String[] s = line2.split(" ");
            graph1.InsertEdges(s[0],s[1], Integer.valueOf(s[2]), Integer.valueOf(s[3]));

        }
        bufferedReader1.close();
        br.close();
        return graph1;
    }


}
