public class EdgeNode {
    public int dest;


    public int distance;//
    public int fee;

    public EdgeNode next;

    public EdgeNode(int dest, int fee, int distance) {this.dest = dest;this.distance = distance;
        this.fee = fee;

    }

    public EdgeNode(int dest, int fee, int distance, EdgeNode next) {

    }
}