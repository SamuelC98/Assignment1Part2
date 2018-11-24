public class EdgeNode {
    public int dest;
    public int distance;//
    public int fee;
    public EdgeNode next;

    public EdgeNode(int dest, int fee, int distance) {
        this.dest = dest;this.distance = distance;
        this.fee = fee;

    }

    public int getDest() {
        return dest;
    }

    public int getDistance() {
        return distance;
    }

    public int getFee() {return 0;
    }

    public EdgeNode getNext() {return null;
    }



}