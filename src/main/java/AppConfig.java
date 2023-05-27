import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Car car(){
        return  new Car ("mazda");
    }
    @Bean
    public Bus bus(){
        return new Bus("Икарус");
    }
    @Bean
    public  Pickup pickup(){
        return new Pickup("Rover");
    }
    @Bean(name = "driver")
    public Driver driver(){
        return new Driver("Tony",car());
    }
    @Bean(name = "driver1")
    public Driver driver1(){
        return new Driver("Jon",bus());
    }
    @Bean(name = "driver2")
    public Driver driver2(){
        return new Driver("Any",pickup());
    }
}
