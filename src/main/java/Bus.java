public class Bus extends Transport{
    private String bus;

    public Bus(String bus){
        this.bus = bus;
    }
    public String getBus(){
        return bus;
    }

    @Override
    public void readyTransport() {
        System.out.println(bus + "готов к работе");
    }

    @Override
    public String toString() {
        return "Bus{" +
                "bus='" + bus + '\'' +
                '}';
    }
}
