public class EdgeNode {
    public int dest;
    public int distance;//
    public int fee;
    public EdgeNode next;

    public EdgeNode(int dest, int fee, int distance) {
        this.dest = dest;this.distance = distance;
        this.fee = fee;

    }

    //get destination
    public int getDest() {
        return dest;
    }

    //get distance
    public int getDistance() {
        return distance;
    }

    //get fee
    public int getFee() {
        return fee;
    }

    //get next
    public EdgeNode getNext() {
        return next;
    }



}