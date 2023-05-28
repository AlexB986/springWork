import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Driver driver =context.getBean("driver",Driver.class);
        Driver driver1 =context.getBean("driver1",Driver.class);
        Driver driver2 =context.getBean("driver2",Driver.class);
        driver.readyTransport();
        driver1.readyTransport();
        driver2.readyTransport();
    }
}
