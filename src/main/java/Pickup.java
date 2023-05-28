public class Pickup extends Transport {

    private String pickup;

    public Pickup(String pickup) {
        this.pickup = pickup;
    }

    public String getPickup() {
        return pickup;
    }
    @Override
    public void readyTransport() {
        System.out.println(pickup +" готов к работе");
    }

    @Override
    public String toString() {
        return "Pickup{" +
                "pickup='" + pickup + '\'' +
                '}';
    }
}
