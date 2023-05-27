public class Car extends Transport {
    private String car;

    public Car(String car) {
        this.car = car;
    }
    public String getCar(){
        return car;
    }

    @Override
    public void readyTransport() {
        System.out.println(car +" готов к работе");
    }

    @Override
    public String toString() {
        return "Car{" +
                "car='" + car + '\'' +
                '}';
    }
}
