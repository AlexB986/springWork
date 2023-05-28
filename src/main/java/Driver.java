public class Driver {
    private String name;
    private Transport transport;
    public Driver(String name,Transport transport){
        this.name = name;
        this.transport = transport;
    }
    public String getName(){
        return name;
    }
    public void readyTransport(){
        System.out.println(transport +" готов к работе");
    }
    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", transport=" + transport +
                '}';
    }
}
